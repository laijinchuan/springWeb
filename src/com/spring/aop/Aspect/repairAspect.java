package com.spring.aop.Aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class repairAspect {
	@AfterThrowing(throwing = "ex", pointcut = "execution (* com.spring.aop.AspectJQS.*.*(..))")
	public void doRecutyAction(Throwable ex) {
		System.out.println("目标中异常是:" + ex);
		System.out.println("修复异常");

	}
}
