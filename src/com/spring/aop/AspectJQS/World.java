package com.spring.aop.AspectJQS;

import org.springframework.stereotype.Component;

@Component("world")
public class World {
	public void bar() {
		System.out.println("这是World中的bar方法");
	}
}
