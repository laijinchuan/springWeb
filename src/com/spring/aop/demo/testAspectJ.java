package com.spring.aop.demo;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.AspectJQS.Hello;
import com.spring.aop.AspectJQS.World;

public class testAspectJ {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/aop/AspectJQS/application.xml");
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		Hello hello = (Hello) ctx.getBean("hello");
		World world = (World) ctx.getBean("world");
		hello.foo();
		hello.addUser("孙悟空", "124");
		world.bar();
	}
}
