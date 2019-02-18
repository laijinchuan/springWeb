package com.spring.extend.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.org.Interface.Person;

public class BeanTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/extend/util/application.xml");
		Person c = (Person) ctx.getBean("chinese");
		c.useAxe();
	}
}
