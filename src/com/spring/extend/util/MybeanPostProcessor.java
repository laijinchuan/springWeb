package com.spring.extend.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.spring.extend.impl.Chinese;

public class MybeanPostProcessor implements BeanPostProcessor {
	/**
	 * 对容器中的bean进行后处理
	 * @param bean 需要处理的bean实例
	 * @param beanName bean的配置id
	 * @return 返回处理完成后的bean
	 * @throws BeansException
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean后处理在初始化之后对" + beanName + "进行增强处理");
		if (bean instanceof Chinese) {
			Chinese c = (Chinese) bean;
			c.setName("bean后置处理增强");
		}
		//返回处理后的bean，该实例就是实际项目中使用的bean
		//该Bean实例甚至可以与原bean完全不同
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("bean后处理器在初始化之前对" + beanName + "进行增强处理");

		return bean;
	}

}
