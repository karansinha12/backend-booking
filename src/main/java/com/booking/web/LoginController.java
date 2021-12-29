package com.booking.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.UsersModel;
import com.booking.service.LoginService;

@RestController
@RequestMapping("/booking/users")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<UsersModel> login(@RequestBody UsersModel user){
		return new ResponseEntity<>(loginService.login(user), HttpStatus.OK);
	}
}
