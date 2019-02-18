package com.spring.extend.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class MyBeanFactoryPostProcesser2 implements BeanFactoryPostProcessor, Ordered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactry) throws BeansException {
		System.out.println("spring容器对beanFactory的初始值没有变化");
		System.out.println("spring容器值是" + beanFactry);

	}

	@Override
	public int getOrder() {
		return 1;
	}

}
