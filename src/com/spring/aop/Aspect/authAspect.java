package com.spring.aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class authAspect {
	@Before("execution(* com.spring.aop.AspectJQS.*.*(..))")
	public void authAspect() {
		System.out.println("模拟测试。。。。");
	}
}
