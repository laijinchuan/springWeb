package com.spring.org.testFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class dmoe {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/org/testFactory/application.xml");
		Being bean = ctx.getBean("dog", Being.class);
		bean.demoBing();
		Being bean2 = ctx.getBean("cat", Being.class);
		bean2.demoBing();
	}
}
