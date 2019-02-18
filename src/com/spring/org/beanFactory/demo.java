package com.spring.org.beanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/org/beanFactory/application.xml");
		System.out.println(ctx.getBean("nnet"));
		System.out.println(ctx.getBean("&nnet"));
	}

}
