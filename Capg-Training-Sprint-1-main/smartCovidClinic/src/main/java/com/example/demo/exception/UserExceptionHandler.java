package com.example.demo.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.entity.ErrorResponse;

@ControllerAdvice
public class UserExceptionHandler {
	
	@ExceptionHandler(AdminNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(AdminNotFoundException exception){
		
		ErrorResponse error = new ErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage()); 
		error.setTimeStamp(LocalDateTime.now()); 
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND); 
	}
	
	@ExceptionHandler(AdminExistsException.class)
	public ResponseEntity<ErrorResponse> handleException(AdminExistsException exception){
		
		ErrorResponse error = new ErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage()); 
		error.setTimeStamp(LocalDateTime.now()); 
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND); 
	}
	

	@ExceptionHandler(PatientNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(PatientNotFoundException exception){
		
		ErrorResponse error = new ErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage()); 
		error.setTimeStamp(LocalDateTime.now()); 
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND); 
	}

}
