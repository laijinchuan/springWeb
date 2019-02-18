package com.spring.org.testFactory;

public class demo {

	public Being getBeing(String args) {
		if (args.equalsIgnoreCase("dog")) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
}
