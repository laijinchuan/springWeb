package com.spring.org.service;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class testBean {
	public static void main(String[] args) {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		//		Person p = ctx.getBean("person", Person.class);
		Person p = (Person) ctx.getBean("person");
		p.useAxe();
		Date date = ctx.getBean("date", Date.class);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:MM:ss");
		String format = simpleDateFormat.format(date);
		System.out.println(format);
		Class<?> type = ctx.getType("date");
		System.out.println(type.getName());
		Resource isr = new ClassPathResource("application1.xml");
		DefaultListableBeanFactory benFactory = new DefaultListableBeanFactory();
		new XmlBeanDefinitionReader(benFactory).loadBeanDefinitions(isr);*/
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("application2.xml");
		ClassPathResource resource = new ClassPathResource("application2.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(resource);
		//User bean = beanFactory.getBean("user", User.class);
		//		bean.setTest("");
	}
}
