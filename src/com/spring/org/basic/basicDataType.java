package com.spring.org.basic;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.spring.org.aboutBean.person;

public class basicDataType {
	private String name;
	private Map score;
	private Map<String, person> alleas;
	private Properties pro;
	private Set set;
	private int[] inre;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map getScore() {
		return score;
	}

	public void setScore(Map score) {
		this.score = score;
	}

	public Map<String, person> getAlleas() {
		return alleas;
	}

	public void setAlleas(Map<String, person> alleas) {
		this.alleas = alleas;
	}

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public int[] getInre() {
		return inre;
	}

	public void setInre(int[] inre) {
		this.inre = inre;
	}

	@Override
	public String toString() {
		return "basicDataType [name=" + name + ", score=" + score + ", alleas=" + alleas + ", pro=" + pro + ", set=" + set + ", inre="
				+ Arrays.toString(inre) + "]";
	}

}
