package com.spring.org.testFactory;

public class Cat implements Being {
	private String name;
	private int age;

	public void setAge(int age) {
		this.age = age;

	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void testBing() {
		System.out.println("这是一只猫");
	}

	@Override
	public void demoBing() {
		System.out.println("这是一个猫" + name + "年龄是：" + age);

	}

}
