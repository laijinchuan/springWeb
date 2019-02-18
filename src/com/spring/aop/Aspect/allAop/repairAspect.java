package com.spring.aop.Aspect.allAop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class repairAspect {
	public void doRecoverAction(ProceedingJoinPoint jp) {
		System.out.println("该方法正在运行的是：" + Arrays.toString(jp.getArgs()));
		System.out.println("正在运行的是" + jp.getSignature().getName());

	}
}
