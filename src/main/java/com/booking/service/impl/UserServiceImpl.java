package com.booking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.booking.model.UsersModel;
import com.booking.repository.UserRepository;
import com.booking.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UsersModel login(UsersModel user) {
		//userRepository.save(user); 
		UsersModel userModel = new UsersModel();
		userModel.setName(user.getName());
		userModel.setDob(user.getDob());
		userModel.setPassword(user.getPassword());
		userModel.setUsername(user.getUsername());
		return userRepository.save(user);
		
	}

}
