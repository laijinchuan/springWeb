package com.spring.aop.Aspect.total;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class FourAdviceTest {
	//定义around增强处理
	@Around("execution (* com.spring.aop.AspectJQS.*.*(..))")
	public Object processTx(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("Around增强:执行目标方法之前，模拟开始事务");
		//访问执行目标方法的参数
		Object[] args = pj.getArgs();
		//当执行目标方法的参数存在且第一个是字符串时
		if (args != null && args.length > 0 && args[0].getClass() == String.class) {
			//修改第一个目标参数
			args[0] = "【增加的前缀】" + args[0];
		}
		//执行目标方法
		Object rvt = pj.proceed(args);
		System.out.println("Around增强:执行目标方法之后，模拟结束事务");
		if (rvt instanceof Integer) {
			rvt = (Integer) rvt * (Integer) rvt;
		}
		return rvt;
	}

	//定义before增强处理
	@Before("execution (* com.spring.aop.AspectJQS.*.*(..))")
	public void autoFilter(JoinPoint jp) {
		System.out.println("Before增强：模拟过滤处理");
		System.out.println("Before增强：目标方法为：" + jp.getSignature().getName());
		System.out.println("Before增强：目标参数为：" + Arrays.toString(jp.getArgs()));
		System.out.println("Before增强：目标对象为：" + jp.getTarget());

	}

	//定义AfterReturning增强
	@AfterReturning(pointcut = "execution (* com.spring.aop.AspectJQS.*.*(..))", returning = "rvt")
	public void logTest(JoinPoint jp, Object rvt) {
		System.out.println("AfterReturning增强：目标方法返回值：" + rvt);
		System.out.println("AfterReturning增强：模拟日志记录功能");
		System.out.println("AfterReturning增强：：目标方法为：" + jp.getSignature().getName());
		System.out.println("AfterReturning增强：目标参数为：" + Arrays.toString(jp.getArgs()));
		System.out.println("AfterReturning增强：目标对象为：" + jp.getTarget());
	}

	//定义After增强
	@After("execution (* com.spring.aop.AspectJQS.*.*(..))")
	public void release(JoinPoint jp) {
		System.out.println("After增强：模拟执行完成后的资源释放");
		System.out.println("After增强：目标方法为：" + jp.getSignature().getName());
		System.out.println("After增强：目标参数为：" + Arrays.toString(jp.getArgs()));
		System.out.println("After增强：目标对象为：" + jp.getTarget());
	}
}
