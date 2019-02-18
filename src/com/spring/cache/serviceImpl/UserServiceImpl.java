package com.spring.cache.serviceImpl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.spring.cache.dao.User;
import com.spring.cache.service.UserService;

/**
 * 类级别缓存
 */
@Service("userService")
@Cacheable(value = "users", condition = "#age>10", key = "#name")
/**
 * value 必须属性，可指定多个缓存区名字 key 通过SpEL表达式显式指定缓存的key condition 返回一个boolean的SpEL表达式
 * 只有返回true时才会缓存该方法的返回值 unless 返回一个boolean值 当返回true时 spring就不缓存改方法的返回值
 * @author ThinkPad
 *
 */
public class UserServiceImpl implements UserService {
	public User getUserByNameAndAge(String name, int age) {
		System.out.println("正在执行 getUserByNameAndAge 查询方法");
		return new User(name, age);
	}

	public User getotherUser(String name, int age) {
		System.out.println("正在执行getOtheruser查询方法");
		return new User(name, age);
	}

	//指定name，age进行清除
	@Override
	public void evictUser(String name, int age) {

	}

	//指定清除user缓存区的所有缓存数据
	@Override
	public void evictAll() {
		// TODO Auto-generated method stub

	}

}
