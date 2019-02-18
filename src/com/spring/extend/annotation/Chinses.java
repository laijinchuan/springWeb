package com.spring.extend.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.org.Interface.Axe;
import com.spring.org.Interface.Person;

@Lazy(true) //当spring容器初始化时不会预初始化该bean
@Scope("prototype")
@Component
public class Chinses implements Person {
	@Resource(name = "stoneAxe")
	private Axe axe;

	@Override
	public void useAxe() {
		System.out.println("好饿呀");
		System.out.println(axe.shop());
	}

	@PostConstruct
	public void init() {
		System.out.println("正在执行初始化的init方法");
	}

	@PreDestroy
	public void close() {
		System.out.println("正在执行销毁前的方法close方法");
	}

}
