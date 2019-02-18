package com.spring.org.service;

import com.spring.org.Interface.Person;

public class Chinese implements Person {
	private Axe axe;
	private String Name;

	/*public void setAxe(Axe axe) {
	
		this.axe = axe;
	}*/

	@Override
	public void useAxe() {

		System.out.println(axe.shop());
	}

	public void setName(String name) {
		Name = name;
	}

	public Chinese(Axe axe) {
		this.axe = axe;
	};

}
