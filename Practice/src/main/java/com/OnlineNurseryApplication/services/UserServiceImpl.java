package com.OnlineNurseryApplication.services;

import java.util.List;
import org.modelmapper.ModelMapper;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

import com.OnlineNurseryApplication.entities.*;
import com.OnlineNurseryApplication.exceptions.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.apache.catalina.mapper.Mapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.OnlineNurseryApplication.dto.UserDto;
import com.OnlineNurseryApplication.repositories.AddressRepository;
import com.OnlineNurseryApplication.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
	
	private static Logger logger = LogManager.getLogger();


	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	

	@Override	
	public UserDto createUser(User user) {
		userRepo.save(user);
		UserDto u = new UserDto();
		u.setName(user.getUsername());
		u.setUserEmail(user.getUserEmail());
		u.setAddress(user.getAddress());

		return u;
	}

	@Override
	public UserDto updateUserById(String userEmail, UserDto userdto) throws UserNotFoundException {
		// TODO Auto-generated method stub
		logger.info("Finding the optional object using userId from the database");
		Optional<User> user = userRepo.findUserByuserEmail(userEmail);
		logger.info("checking for the presence of user object");
			if (user.isPresent()) {
				logger.info("Saving the updated details of the user");
				User newUser = user.get();
				addressRepo.delete(user.get().getAddress());
				
//				List<Address> addressList  = new ArrayList<>();
//				for(Address add : newUser.getAddressSet()) {
//					Address add1 = new Address();
//					add1.setAddressId(add.getAddressId());
//					add1.setCity(add.getCity());
//					add1.setHouseNo(add.getHouseNo());
//					add1.setPinCode(add.getPinCode());
//					add1.getUser().setId(newUser.getId());
//					add1.getUser().setUserEmail(newUser.getUserEmail());
//					add1.getUser().setPassword(newUser.getPassword());
//					add1.getUser().setUserName(newUser.getUsername());
//				}
//				newUser.setAddressSet(addressList);
				ModelMapper mapper = new ModelMapper();
				mapper.map(userdto,newUser);
				userRepo.save(newUser);
				// Login updateLogin = loginRepo.;
				// updateLogin.setEmail(nUser.getEmail());

//				newUser.setAddressSet(userdto.getAddress());
//				newUser.setUserEmail(userdto.getUserEmail());
//				newUser.setUserName(userdto.getName());
//				System.out.println(newUser.getAddressSet());
//				userRepo.save(newUser);
//				UserDto userDto = new UserDto();
//				// userdto.setAddress(newUser.getAddress());
//				userDto.setUserEmail(newUser.getUserEmail());
//				userDto.setName(newUser.getUsername());
//				userDto.setId(newUser.getId());
//				userDto.setAddress(newUser.getAddressSet());
//				return userDto;
				
//				Set<Address> addressSet = newUser.getAddressSet();
//				for(Address add:addressSet) {
//					add.setUser(null);
//					addressRepo.save(add);
//				}
//				ModelMapper modelMapper = new ModelMapper();	
//
//				User updatedUser = modelMapper.map(userdto, User.class);
//				userRepo.save(updatedUser);
//				System.out.println(userdto);
//				System.out.println(newUser);
//				return userdto;		
//				for(Address add:newUser.getAddressSet()) {
//					//addressRepo.deleteById(add.getAddressId());
//				}
//				newUser.setAddressSet(userdto.getAddress());
//				newUser.setUserEmail(userdto.getUserEmail());
//				newUser.setUserName(userdto.getName());
//				userRepo.save(newUser);
//				return userdto;
				UserDto userd = modelMapper.map(newUser, UserDto.class);
//			}
				return userd;
			}
			else {
			// TODO Auto-generated catch block
			throw new UserNotFoundException("User not found with user id " + userEmail);

			}
	}

	

	@Override
	public UserDto getUserById(Integer userId) throws UserNotFoundException {
		logger.info("Getting the optional object of type user based on the userId from the database");
		Optional<User> user = userRepo.findById(userId);
		logger.info("Checking for the presence of user object ");
		if (user.isPresent()) {
			logger.info("User Object returned successfully");
			User nuser = user.get();
			UserDto userdto = new UserDto();
			//userdto.setAddress(nuser.getAddress());
			userdto.setUserEmail(nuser.getUserEmail());
			userdto.setName(nuser.getUsername());
			return userdto;
		}
		else {
			throw new UserNotFoundException("User not found with user id " + userId);
		}

	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> userList = userRepo.findAll();
		List<UserDto> userDtoList = new ArrayList<UserDto>();
		for (User n : userList) {
			UserDto user = modelMapper.map(n, UserDto.class);
//			UserDto userDto = new UserDto();
//			//userDto.setAddress(n.getAddress());
//			userDto.setUserEmail(n.getUserEmail());
//			userDto.setName(n.getUsername());
			userDtoList.add(user);

		}
		return userDtoList;

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserDetails u = this.userRepo.findUserByuserEmail(username)
				.orElseThrow(() -> new UsernameNotFoundException("Username not found " + username));

		return u;
	}

	@Override
	public UserDto getUserByEmail(String email) throws UserNotFoundException {
		logger.info("Getting the optional object of type user based on the user Email from the database");
		Optional<User> user = userRepo.findUserByuserEmail(email);
		logger.info("Checking for the presence of user object ");
		if (user.isPresent()) {
			logger.info("User Object returned successfully");
			User nuser = user.get();
			UserDto userdto = new UserDto();
			userdto.setAddress(nuser.getAddress());
		userdto.setUserEmail(nuser.getUserEmail());
			userdto.setName(nuser.getUserName());
			return userdto;
//			return nuser;
		}
		else {
				throw new UserNotFoundException("User not found with user email " + email);
		}
	}

	@Override
	public String updateUserPassword(String userEmail, String newPassword) throws UserNotFoundException {
		// TODO Auto-generated method stublogger.info("Getting the optional object using userId provided");
		Optional<User> user = userRepo.findUserByuserEmail(userEmail);
		logger.info("checking for the presence of user object in the container");
		if (user.isPresent()) {
			User dbUser = user.get();
			logger.info("updating and saving the updated password in the database");
			dbUser.setPassword(passwordEncoder.encode(newPassword));
			userRepo.save(dbUser);
//			UserDto userDto = new UserDto();
//			//userDto.setAddress(dbUser.getAddress());
//			userDto.setUserEmail(dbUser.getUserEmail());
//			userDto.setName(dbUser.getUsername());
			return "Password Updated Successfully";
		} else {
			// if User not found in the database then it will throw exception.
			throw new UserNotFoundException("User not found with user id " + userEmail);

		}
	}

	@Override
	public UserDto getUserByName(String name) throws UserNotFoundException {
		logger.info("Getting the optional object of type user based on the username from the database");
		Optional<User> user = userRepo.findUserByuserName(name);
		logger.info("Checking for the presence of user object ");
		if (user.isPresent()) {
			logger.info("User Object returned successfully");
			User nuser = user.get();
			UserDto userdto = new UserDto();
			userdto.setAddress(nuser.getAddress());
			userdto.setUserEmail(nuser.getUserEmail());
			userdto.setName(nuser.getUsername());
			userdto.setAddress(nuser.getAddress());
			return userdto;
//			return nuser;
		}
		else {
				throw new UserNotFoundException("User not found with user email " + name);
		}
	}

}
