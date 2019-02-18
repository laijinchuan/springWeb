package com.spring.org.aboutBean;

public class person {
	private String name;
	private String age;
	private String hight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHight() {
		return hight;
	}

	public void setHight(String hight) {
		this.hight = hight;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", hight=" + hight + "]";
	}
}
