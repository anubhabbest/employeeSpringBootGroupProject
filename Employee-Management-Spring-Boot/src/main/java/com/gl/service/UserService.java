package com.gl.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.gl.entity.User;
import com.gl.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	public User addUser(@RequestBody User user)
	{
		return userRepository.saveAndFlush(user);
	}
	
}
