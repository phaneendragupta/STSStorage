package com.OnlineNurseryApplication.controllers;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineNurseryApplication.dto.UserDto;
import com.OnlineNurseryApplication.entities.Address;
import com.OnlineNurseryApplication.entities.User;
import com.OnlineNurseryApplication.exceptions.AddressNotFoundException;
import com.OnlineNurseryApplication.exceptions.UserNotFoundException;
import com.OnlineNurseryApplication.services.AddressServiceImpl;
import com.OnlineNurseryApplication.services.UserServiceImpl;

import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/User")
public class UserController {
	
	
	
	private static Logger logger = LogManager.getLogger();

	@Autowired
	UserServiceImpl userService;
	
	@Autowired
	AddressServiceImpl addressService;

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
//	@PreAuthorize("hasAuthority('USER')")
	ResponseEntity<UserDto> updateUserById(@Valid @RequestBody UserDto user, @PathVariable("id") String userEmail)
			throws UserNotFoundException {
		logger.info("Getting request to update the user details based on the id provided");
		UserDto updated = userService.updateUserById(userEmail, user);
		logger.info("User details are updated");
		return new ResponseEntity<>(updated, HttpStatus.OK);
	}


	@PatchMapping("/updatepassword{userEmail}")
//	@PreAuthorize("hasAuthority('USER')")
	ResponseEntity<String> updateUserPassword(@PathVariable("userEmail") String userEmail, @Valid @RequestBody String newPassword)
			throws UserNotFoundException {
		logger.info("Request has been received to update the user password based on userId");
		String updatedUser = userService.updateUserPassword(userEmail, newPassword);
		logger.info("Updated the password");
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	}
	@GetMapping("/getuserbyname/{name}")
	@PreAuthorize("hasAuthority('USER')")
	ResponseEntity<UserDto> getUserByName(@PathVariable("name") String userName)
			throws UserNotFoundException {
		logger.info("Request has been received to get user based on userName");
		UserDto userDto = userService.getUserByName(userName);
		logger.info("Returned the User");
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}
	@GetMapping("/getuserbyemail/{email}")
//	@PreAuthorize("hasAnyAuthority('USER','ADMIN')")
	ResponseEntity<UserDto> getUserByEmail(@PathVariable("email") String email)
			throws UserNotFoundException {
		logger.info("Request has been received to get user based on email");
		UserDto userDto = userService.getUserByEmail(email);
		logger.info("Returned the User");
		return new ResponseEntity<>(userDto, HttpStatus.OK);
	}
	@GetMapping("/deleteAddress/{userId}")
	@PreAuthorize("hasAnyAuthority('USER','ADMIN')")
	public ResponseEntity<String> deleteUser(@PathVariable String addId) throws UserNotFoundException, AddressNotFoundException{
		Integer uid = Integer.parseInt(addId);
	String response  = 	addressService.DeleteAddress(uid);
	return new ResponseEntity<String>(response,HttpStatus.OK);

}
	@PatchMapping("/updateAddress{id}")
	@PreAuthorize("hasAuthority('USER')")
	ResponseEntity<String> updateAddress(@PathVariable("id") int addId, @Valid @RequestBody Address newAddress)
			throws AddressNotFoundException {
		logger.info("Request has been received to update the user's address based on addressId");
		String response = addressService.updateAddress(addId, newAddress);
		logger.info("Updated the password");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
