package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repo.UserRegisterRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRegisterRepository userRegister;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRegister.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRegister.findAll();
	}

}
