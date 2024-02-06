package com.OnlineNurseryApplication.services;

import com.OnlineNurseryApplication.exceptions.UserNotFoundException;

public interface AdminService  {
	
	String deleteUser(String userEmail) throws UserNotFoundException;
}
