package com.spring.aop.AspectJQS;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	public void foo() {
		System.out.println("这是Hello中的foo方法");
	}

	public int addUser(String username, String password) {
		System.out.println("这是Hello中的添加用户方法" + username);
		//		if (username.length() > 0 && username.length() < 10) {
		//			throw new IllegalArgumentException("长度不正确");
		//		}
		return 20;
	}
}
