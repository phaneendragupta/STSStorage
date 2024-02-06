package com.weather.app.demo.service;

import java.util.List;
import java.util.Optional;


import com.weather.app.demo.dto.UserRegistrationDto;
import com.weather.app.demo.entity.User;

public interface UserService {
	//extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);


    List<User> findAllUsers();
	User save (User user);
	Optional<User> getUserById(int id);
	User registerUser(User user);
	User updateUser(int id, User user);
	String deleteUser(int id);

	
}