package com.weatherapp.services;

import com.weatherapp.exceptions.UserNotFoundException;

public interface AdminService  {

	String delUserById(Integer userId) throws UserNotFoundException;

}
