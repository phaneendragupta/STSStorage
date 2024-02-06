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
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weatherapp.dto.UserDto;
import com.weatherapp.entities.User;
import com.weatherapp.exceptions.UserNotFoundException;
import com.weatherapp.services.UserServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/User")


public class UserController {

	private static Logger logger = LogManager.getLogger();


	@Autowired
	UserServiceImpl userService;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('USER','ADMIN')")
	ResponseEntity<UserDto> getUserById(@PathVariable("id") int userId) throws UserNotFoundException {
		logger.info("Getting Request to get the user details with respect to the id provided");
		UserDto user = userService.getUserById(userId);
		logger.info("Request has been received appropriate action performed and returned the user object");
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	
	

	@PostMapping("/addUser")
	@PreAuthorize("hasAuthority('USER')")
	ResponseEntity<UserDto> addUser(@Valid @RequestBody User user) {
		logger.info("Request has been received to add the user into database");
		UserDto newUser = userService.createUser(user);
		logger.info("user has been added into database");
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
		
	}

	@PutMapping("/update/{id}")
	@PreAuthorize("hasAuthority('USER')")
	//ResponseEntity<String> updateUserById(@PathVariable("id") Integer Id, @Valid @RequestBody String userName)
	ResponseEntity<UserDto> updateUserById(@Valid @RequestBody UserDto user, @PathVariable("id") String userEmail)

			throws UserNotFoundException {
		logger.info("Getting request to update the user details based on the id provided");
		//String updated = userService.updateUserById( Id,userName);
		UserDto updated = userService.updateUserById(userEmail, user);

		logger.info("User details are updated");
		return new ResponseEntity<>(updated, HttpStatus.OK);
	}

	@PatchMapping("/updatepassword{userEmail}")
	@PreAuthorize("hasAuthority('USER')")
	ResponseEntity<String> updateUserPassword(@PathVariable("userEmail") String userEmail,
			@Valid @RequestBody String newPassword) throws UserNotFoundException {
		logger.info("Request has been received to update the user password based on userEmail");
		String updatedUser = userService.updateUserPassword(userEmail, newPassword);
		logger.info("Updated the password");
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	}

//	
//	@GetMapping("/Allusers")
//	@PreAuthorize("hasAuthority('ADMIN')")
//	ResponseEntity<List<UserDto>> getAllUsers() {
//		logger.info("Getting Request to get all the user details");
//		List<UserDto> users = userService.getAllUsers();
//		logger.info("User details have been returned for your reference");
//		return new ResponseEntity<>(users, HttpStatus.OK);
//	}
//	
//	@DeleteMapping("delete/{id}")
//	@PreAuthorize("hasAnyAuthority('USER','ADMIN')")
//	ResponseEntity<String> delUserById(@PathVariable("id") Integer userId) throws UserNotFoundException {
//		logger.info("Getting Request to get the user details with respect to the id provided");
//		String deluser = userService.delUserById(userId);
//		logger.info("Request has been received appropriate action performed and returned the user object");
//		return new ResponseEntity<>(deluser, HttpStatus.OK);
//	}
		
	@GetMapping("/getuserbyname/{name}")
	@PreAuthorize("hasAuthority('USER')")
	ResponseEntity<UserDto> getUserByName(@PathVariable("name") String userName) throws UserNotFoundException {
		logger.info("Request has been received to get user based on userName");
		UserDto userDto = userService.getUserByName(userName);
		logger.info("Returned the User");
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}

	@GetMapping("/getuserbyemail/{email}")
	@PreAuthorize("hasAnyAuthority('USER','ADMIN')")
	ResponseEntity<UserDto> getUserByEmail(@PathVariable("email") String email) throws UserNotFoundException {
		logger.info("Request has been received to get user based on email");
		UserDto userDto = userService.getUserByEmail(email);
		logger.info("Returned the User");
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}

}
