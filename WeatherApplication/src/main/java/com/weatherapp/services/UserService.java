package com.weatherapp.services;

import java.util.List;

import com.weatherapp.dto.UserDto;
import com.weatherapp.entities.User;
import com.weatherapp.exceptions.UserNotFoundException;

public interface UserService {
	UserDto createUser(User user);

	//UserDto updateUserById(Integer userId,UserDto userDto) throws UserNotFoundException;

	UserDto getUserById(Integer userId) throws UserNotFoundException;

	UserDto getUserByEmail(String email) throws UserNotFoundException;

	UserDto getUserByName(String name) throws UserNotFoundException;
	


	List<UserDto> getAllUsers();

	//String delUserById(Integer userId) throws UserNotFoundException;

	String updateUserPassword(String userEmail, String newPassword) throws UserNotFoundException;

	UserDto updateUserById(String userEmail, UserDto userdto) throws UserNotFoundException;


}
