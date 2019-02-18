package com.spring.org.event;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * 容器监听器
 */
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.sun.mail.util.MailSSLSocketFactory;

public class Notifier implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof emailEvent) {
			emailEvent address = (emailEvent) event;
			Properties props = sendMessage();
			Session session = Session.getInstance(props);
			try {
				Transport transport = session.getTransport();
				transport.connect("smtp.qq.com", address.getAddress(), address.getPassword());
				MimeMessage createMessage = createMessage(session, address.getAddress());
				transport.sendMessage(createMessage, createMessage.getAllRecipients());
				transport.close();
				System.out.println("发送成功");
			} catch (MessagingException e) {

				e.printStackTrace();
			}

		} else {
			System.out.println("不做任何处理");
		}

	}

	private Properties sendMessage() {
		Properties props = new Properties();
		props.setProperty("mail.debug", "true");
		props.setProperty("mail.smtp.auto", "true");
		props.setProperty("mail.host", "smtp.qq.com");
		props.setProperty("mail.transport.protocol", "smtp");
		MailSSLSocketFactory sf;
		try {
			sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			props.put("mail.smtp.ssl.enable", "true");
			props.put("mail.smtp.ssl.socketFactory", sf);
		} catch (GeneralSecurityException e) {

			e.printStackTrace();
		}
		return props;

	}

	private MimeMessage createMessage(Session session, String address) throws MessagingException {
		MimeMessage mimeMessage = new MimeMessage(session);
		mimeMessage.setFileName("测试邮件");
		mimeMessage.setFrom(new InternetAddress(address));
		mimeMessage.setRecipient(RecipientType.TO, new InternetAddress("lai_jc@126.com"));
		mimeMessage.setSubject("测试标题");
		mimeMessage.setContent("你好，世界", "text/html;charset=utf-8");
		return mimeMessage;
	}

}
