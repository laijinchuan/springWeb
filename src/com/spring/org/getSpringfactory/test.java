package com.spring.org.getSpringfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/org/getSpringfactory/application.xml");
		Person bean = ctx.getBean("person", Person.class);
		bean.syaHello("你好");
	}
}
