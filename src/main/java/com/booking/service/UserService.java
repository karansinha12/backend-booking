package com.booking.service;

import org.springframework.stereotype.Service;

import com.booking.model.UsersModel;

public interface UserService {

	public UsersModel login(UsersModel user);
}
