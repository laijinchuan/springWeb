package com.spring.cache.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.cache.dao.User;
import com.spring.cache.service.UserService;

public class cacheTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/cache/application.xml");
		UserService bean = ctx.getBean("userService1", UserService.class);
		User userByNameAndAge = bean.getUserByNameAndAge("猪八戒", 9);
		User getotherUser = bean.getotherUser("猪八戒", 9);
		System.out.println(getotherUser == userByNameAndAge);
		UserService u = ctx.getBean("userService2", UserService.class);
		User u1 = u.getotherUser("猪八戒", 200);
		User u2 = u.getUserByNameAndAge("猪八戒", 300);
		u.evictUser("猪八戒", 200);//清除指定缓存
		User u4 = u.getotherUser("猪八戒", 200);
		System.out.println(u4 == u1);//false 因为清除了 猪八戒  200的数据
		User u5 = u.getUserByNameAndAge("猪八戒", 300);
		System.out.println(u5 == u2);//true 还存在缓存中
		u.evictAll();//清除所有缓存
		User u6 = u.getotherUser("猪八戒", 200);
		User u7 = u.getUserByNameAndAge("猪八戒", 300);
		System.out.println(u6 == u1);//false 清除了所有缓存
		System.out.println(u7 == u2);//false 清除了所有缓存

	}
}
