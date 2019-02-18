package com.spring.extend.impl;

import org.springframework.beans.factory.InitializingBean;

import com.spring.org.Interface.Person;
import com.spring.org.service.Axe;

public class Chinese implements Person, InitializingBean {
	private String name;
	private Axe axe;

	@Override
	public void useAxe() {
		System.out.println(axe.shop() + "  " + name);
	}

	public void setName(String name) {
		System.out.println("执行setName");
		this.name = name;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("正在执行初始胡按方法afterPropertiesSet");
	}

	public void init() {
		System.out.println("正在执行初始化方法init.....");
	}
}
