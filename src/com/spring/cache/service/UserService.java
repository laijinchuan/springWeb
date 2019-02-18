package com.spring.cache.service;

import com.spring.cache.dao.User;

public interface UserService {
	public User getUserByNameAndAge(String name, int age);

	public User getotherUser(String name, int age);

	public void evictUser(String name, int age);

	public void evictAll();
}
