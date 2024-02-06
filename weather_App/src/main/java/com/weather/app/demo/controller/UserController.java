package com.weather.app.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.app.demo.entity.User;
import com.weather.app.demo.service.UserService;
import com.weather.app.demo.service.UserServiceImpl;



@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	private static final Logger logger= LoggerFactory.getLogger(UserController.class);

	
@GetMapping("/{id}")
public ResponseEntity<Optional<User>> getUserById(@PathVariable int id){
	
	logger.info("Endpoint '/user/{}' called", id);
	Optional<User> user = userService.getUserById(id);
	if (user !=null) {
		return ResponseEntity.ok(user);
		}
	else {
		
		return ResponseEntity.notFound().build(); 
	}
	
}


@PostMapping("/register")
public ResponseEntity<User> registerUser(@RequestBody User user){
	logger.info("Registering a new user: {}",user.getUserName());
	User registeredUser = userService.registerUser(user);
	return ResponseEntity.status(HttpStatus.CREATED).body(registeredUser);
}



@PutMapping("/{id}")
public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user ){
  logger.info("Updating user: ()", user.getUserName());
  User updatedUser = userService.updateUser(id,user);
  if (updatedUser !=null) {
	  return ResponseEntity.ok(updatedUser);
  }
	  else {
		  
		  logger.warn("User with ID() not found", id);
		  return ResponseEntity.notFound().build();
	  } 
	
  
}

@DeleteMapping("/{id}")
public String deleteUser(@PathVariable int id) {
    return userService.deleteUser(id);
}

	
@GetMapping("/getAll")
public List<User> getAllUsers() {
    return userService.findAllUsers();
}

		
}
