package com.spring.aop.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TxAspect {
	@Around("execution (* com.spring.aop.AspectJQS.*.*(..))")
	public Object prObject(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("执行方法之前，模拟开始事务");
		//获取目标方法的原返回值
		Object[] args = jp.getArgs();
		if (args != null && args.length > 1) {
			args[0] = "【增加的前缀】" + args[0];

		}
		//以改变后的参数去执行
		Object rvt = jp.proceed(args);
		System.out.println("执行方法之后，模拟结束事务");
		//如果返回参数是integer 就取平方
		if (rvt instanceof Integer) {
			rvt = (Integer) rvt * (Integer) rvt;
		}
		return rvt;

	}
}
