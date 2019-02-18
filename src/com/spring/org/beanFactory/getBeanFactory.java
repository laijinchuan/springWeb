package com.spring.org.beanFactory;

import java.lang.reflect.Field;

import org.springframework.beans.factory.FactoryBean;

public class getBeanFactory implements FactoryBean<Object> {
	private String targetClass;
	private String targetFiled;

	public void setTargetClass(String targetClass) {
		this.targetClass = targetClass;
	}

	public void setTargetFiled(String targetFiled) {
		this.targetFiled = targetFiled;
	}

	@Override
	public Object getObject() throws Exception {
		Class<?> clazz = Class.forName(targetClass);
		Field field = clazz.getField(targetFiled);
		return field.get(null);
	}

	@Override
	public Class<?> getObjectType() {
		return Object.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
