package com.spring.org.aboutBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/org/aboutBean/application.xml");
		System.out.println(ctx.getBean("p1") == ctx.getBean("p1"));
		person bean = ctx.getBean("p1", person.class);
		person bean1 = ctx.getBean("p2", person.class);
		System.out.println(bean1.toString());
		System.out.println(ctx.getBean("p2") == ctx.getBean("p2"));
		System.out.println(ctx.getBean("date"));
		Thread.sleep(2000);
		System.out.println(ctx.getBean("date"));
		String[] aliases = ctx.getAliases("p3");
		for (String a : aliases) {
			person bean2 = ctx.getBean(a, person.class);
			System.out.println(bean2.toString());
		}
	}

}
