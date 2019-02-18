package com.spring.aop.Aspect.log;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class logAspect {
	@AfterReturning(returning = "rvt", pointcut = "execution(* com.spring.aop.AspectJQS.*.*(..))&&args(arg0,arg1)")
	public void log(Object rvt, String arg0, String arg1) {
		System.out.println("获取目标返回值" + rvt);
		System.out.println("获取目标方法的参数1" + arg0);
		System.out.println("获取目标方法的参数2" + arg1);
		System.out.println("模拟功能日志功能");

	}
}
