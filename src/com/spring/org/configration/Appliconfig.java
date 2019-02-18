package com.spring.org.configration;

import org.springframework.beans.factory.annotation.Value;

import com.spring.org.service.StoneAxe;

public class Appliconfig {
	@Value("猪八戒")
	String personName;

	public StoneAxe stoneAxe() {
		return new StoneAxe();

	}
}
