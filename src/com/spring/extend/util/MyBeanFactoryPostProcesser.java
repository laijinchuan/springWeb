package com.spring.extend.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class MyBeanFactoryPostProcesser implements BeanFactoryPostProcessor, Ordered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactry) throws BeansException {
		System.out.println("spring容器对beanFactory的初始值没有变化1");
		System.out.println("spring容器值是1" + beanFactry);

	}

	@Override
	public int getOrder() {
		return 0;
	}

}
