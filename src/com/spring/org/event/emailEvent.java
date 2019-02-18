package com.spring.org.event;

import org.springframework.context.ApplicationEvent;

public class emailEvent extends ApplicationEvent {
	public emailEvent(Object source) {
		super(source);
	}

	private String address;
	private String text;
	private String password;

	public emailEvent(String address, String text, Object source, String password) {
		super(source);
		this.address = address;
		this.text = text;
		this.password = password;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
