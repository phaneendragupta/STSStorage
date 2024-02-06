package com.weatherapp.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weatherapp.dto.UserDto;
import com.weatherapp.exceptions.UserNotFoundException;
import com.weatherapp.services.AdminServiceImpl;
import com.weatherapp.services.UserServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminController {

	private static Logger logger = LogManager.getLogger();

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	AdminServiceImpl adminService;

//	@DeleteMapping("/delete/{userEmail}")
//	//@PreAuthorize("hasAuthority('ADMIN')")
//	public ResponseEntity<String> deleteUser(@PathVariable String userEmail) throws UserNotFoundException{
////		Integer uid = Integer.parseInt(userId);
//	String response  = 	adminService.deleteUser(userEmail);
//	return new ResponseEntity<>(response,HttpStatus.OK);
//
//
//	}
//	@GetMapping("/Allusers")
////	@PreAuthorize("hasAuthority('ADMIN')")
//	ResponseEntity<List<UserDto>> getAllUsers() {
//		logger.info("Getting Request to get all the user details");
//		List<UserDto> users = userService.getAllUsers();
//		logger.info("User details have been returned for your reference");
//		return new ResponseEntity<>(users, HttpStatus.OK);
//
//	}
	
	
	
	@GetMapping("/Allusers")
	//@PreAuthorize("hasAuthority('ADMIN')")
	ResponseEntity<List<UserDto>> getAllUsers() {
		logger.info("Getting Request to get all the user details");
		List<UserDto> users = userService.getAllUsers();
		logger.info("User details have been returned for your reference");
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	//@PreAuthorize("hasAnyAuthority('USER','ADMIN')")
	ResponseEntity<String> delUserById(@PathVariable Integer userId) throws UserNotFoundException {
		logger.info("Getting Request to get the user details with respect to the id provided");
		String deluser = adminService.delUserById(userId);
		logger.info("Request has been received appropriate action performed and returned the user object");
		return new ResponseEntity<>(deluser, HttpStatus.OK);
	}


}
