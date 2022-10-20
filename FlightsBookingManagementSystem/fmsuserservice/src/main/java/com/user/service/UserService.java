package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.Booking;
import com.user.entity.User;

@Service
public interface UserService {
	public User addUser(User user);
	public List<User> getUsers();
}
