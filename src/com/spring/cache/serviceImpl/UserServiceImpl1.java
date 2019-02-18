package com.spring.cache.serviceImpl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.spring.cache.dao.User;
import com.spring.cache.service.UserService;

/**
 * 方法级别缓存
 */
@Service("userService1")
public class UserServiceImpl1 implements UserService {
	@Cacheable(value = "user1")
	public User getUserByNameAndAge(String name, int age) {
		System.out.println("正在执行 getUserByNameAndAge 查询方法");
		return new User(name, age);
	}

	@Cacheable(value = "user2")
	public User getotherUser(String name, int age) {
		System.out.println("正在执行getOtheruser查询方法");
		return new User(name, age);
	}

	@Override
	public void evictUser(String name, int age) {
		// TODO Auto-generated method stub

	}

	@Override
	public void evictAll() {
		// TODO Auto-generated method stub

	}

}
