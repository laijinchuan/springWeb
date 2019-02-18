package com.spring.org.service;

public class Person {
	private Axe axe;

	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	public void useAxe() {

		System.out.println("我想吃饭");
		System.out.println(axe.shop());
	}
}
