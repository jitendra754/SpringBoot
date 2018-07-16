package com.Infogain.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Infogain.demo.dao.UserDao;
import com.Infogain.demo.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public User createUser(User applicationUser) {
		return userDao.save(applicationUser);
	}
	
	

}
