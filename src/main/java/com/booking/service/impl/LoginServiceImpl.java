package com.booking.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.exception.UserNotFoundException;
import com.booking.exception.WrongPasswordException;
import com.booking.model.UsersModel;
import com.booking.repository.UserRepository;
import com.booking.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UsersModel login(UsersModel user) {
		Optional<UsersModel> opt = userRepository.findById(user.getUsername());
		if(opt.isEmpty()) {
			throw new UserNotFoundException();
		}
		UsersModel u = opt.get();
		if(!u.getPassword().equals(user.getPassword())) {
			throw new WrongPasswordException();
		}
		return u;
	}

}
