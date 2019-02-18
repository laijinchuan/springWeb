package com.spring.org.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
	public static void main(String[] args) {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/org/basic/application2.xml");
		basicDataType bean = ctx.getBean("basicData", basicDataType.class);
		System.out.println(bean.toString());*/
		/*List list = new ArrayList<>();
		list.add(1);
		System.out.println(list.get(0));
		System.out.println(list.toString());*/

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/org/basic/application2.xml");
		test bean = ctx.getBean("test", test.class);
		System.out.println(bean.getPerson1().getName());
	}
}
