package com.spring.aop.Aspect.total;

public class Second {
	public void Filter(String a) {
		System.out.println("目标的参数为" + a);
		System.out.println("Before增强；启动权限检查");
	}
}
