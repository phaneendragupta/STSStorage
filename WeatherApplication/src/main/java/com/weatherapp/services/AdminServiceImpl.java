package com.weatherapp.services;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.weatherapp.dto.UserDto;
import com.weatherapp.entities.User;
import com.weatherapp.exceptions.UserNotFoundException;
import com.weatherapp.repositories.UserRepository;


@Service
public class AdminServiceImpl implements AdminService {
	private static Logger logger = LogManager.getLogger();

	@Autowired
	private UserRepository userRepo;



	@Override
	public String delUserById(Integer userId) throws UserNotFoundException {
		Optional<User> user = userRepo.findById(userId);
		if (user.isPresent()) {
			logger.info("User has been deleted");
			userRepo.delete(user.get());
		} else {
			throw new UserNotFoundException("User not found with user id " + userId);
		}
		logger.info("Returning deleted user object");

		User deluser = user.get();
		UserDto userdto = new UserDto();

		userdto.setUserEmail(deluser.getUserEmail());
		userdto.setName(deluser.getUserName());
		return "User Deleted SuccessFully: "+ userdto.getName()	;
		
		}



}
