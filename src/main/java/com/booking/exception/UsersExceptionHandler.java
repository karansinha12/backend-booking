package com.booking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UsersExceptionHandler{

	@ExceptionHandler(UserFoundException.class)
	public ResponseEntity<Object> userFoundException(UserFoundException e){
		return new ResponseEntity<>("User already exists with given username", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> userNotFoundException(UserNotFoundException e){
		return new ResponseEntity<>("No such username found", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(WrongPasswordException.class)
	public ResponseEntity<Object> wrongPasswordException(WrongPasswordException e){
		return new ResponseEntity<>("Wrong password", HttpStatus.CONFLICT);
	}

}
