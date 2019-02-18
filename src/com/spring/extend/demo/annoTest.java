package com.spring.extend.demo;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.org.Interface.Person;

public class annoTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/extend/annotation/application2.xml");
		System.out.println("234567890p" + Arrays.toString(ctx.getBeanDefinitionNames()));
		Person p = (Person) ctx.getBean("chinses");
		p.useAxe();
	}
}
