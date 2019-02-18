package com.spring.cache.serviceImpl;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.spring.cache.dao.User;
import com.spring.cache.service.UserService;

/**
 * 清除缓存
 */
@Service("userService2")
@Cacheable(value = "users", condition = "#age>10") //key = "#name"
/**
 * value 必须属性，可指定多个缓存区名字 key 通过SpEL表达式显式指定缓存的key condition 返回一个boolean的SpEL表达式
 * 只有返回true时才会缓存该方法的返回值 unless 返回一个boolean值 当返回true时 spring就不缓存改方法的返回值
 * @author ThinkPad
 *
 */
public class UserServiceImpl2 implements UserService {
	public User getUserByNameAndAge(String name, int age) {
		System.out.println("正在执行 getUserByNameAndAge 查询方法");
		return new User(name, age);
	}

	public User getotherUser(String name, int age) {
		System.out.println("正在执行getOtheruser查询方法");
		return new User(name, age);
	}

	//指定name，age进行清除
	@CacheEvict(value = "users")
	@Override
	public void evictUser(String name, int age) {
		System.out.println("正在清除" + name + "，age," + age + "的缓存");
	}

	//指定清除user缓存区的所有缓存数据
	@CacheEvict(value = "users", allEntries = true)
	//value 指定清除哪个缓存区数据
	//allEntries 是否清除整个缓存区的数据
	//beforeInvocation 指定是都在方法之前清除缓存 默认在方法执行完成之后
	//condition 指定SpEL表达式  为true时清除缓存
	//key 通过SpEL显示指定缓存的key
	@Override
	public void evictAll() {
		System.out.println("正在清除所有缓存");
	}

}
