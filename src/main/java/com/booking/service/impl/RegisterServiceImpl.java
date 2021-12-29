package com.booking.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.exception.UserFoundException;
import com.booking.model.UsersModel;
import com.booking.repository.UserRepository;
import com.booking.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UsersModel register(UsersModel user) {
		Optional<UsersModel> opt = userRepository.findById(user.getUsername());
		if(opt.isPresent()) {
			throw new UserFoundException();
		}
		UsersModel u = new UsersModel();
		u.setDob(user.getDob());
		u.setName(user.getName());
		u.setPassword(user.getPassword());
		u.setUsername(user.getUsername());
		return userRepository.save(u);
	}

}
