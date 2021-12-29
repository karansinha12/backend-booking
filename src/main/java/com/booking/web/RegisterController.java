package com.booking.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.UsersModel;
import com.booking.service.RegisterService;

@RestController
@RequestMapping("/booking/users")
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/register")
	public ResponseEntity<UsersModel> register(@RequestBody UsersModel user){
		return new ResponseEntity<>(registerService.register(user), HttpStatus.OK);
	}
}
