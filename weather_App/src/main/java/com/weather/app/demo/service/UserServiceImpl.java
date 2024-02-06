package com.weather.app.demo.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.weather.app.demo.dto.UserRegistrationDto;
//import com.weather.app.demo.entity.Role;
import com.weather.app.demo.entity.User;
import com.weather.app.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//	
	
	

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepo = userRepository;
	}

//	@Override
//	public User save(UserRegistrationDto registrationDto) {
//		User user = new User(registrationDto.getUserName() 
//				, registrationDto.getUserEmail(),
//				passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")));
//		
//		return userRepo.save(user);
//	}
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	
//		User user = userRepo.findByUserEmail(username);
//		if(user == null) {
//			throw new UsernameNotFoundException("Invalid username or password.");
//		}
//		return new org.springframework.security.core.userdetails.User(user.getUserEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));		
//	}
//	
//	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
//		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());
//	}


	@Override
	public List<User> findAllUsers() {
		List<User> users = userRepo.findAll();
		return users;

	}

	
	@Override
	public String deleteUser(int id) {
		userRepo.deleteById(id);
		return "Deleted Successfully";
	}

	@Override
	public Optional<User> getUserById(int id) {
		Optional<User> user = userRepo.findById(id);
		return user;
	}

	@Override
	public User registerUser(User user) {

		return userRepo.save(user);
	}

	@Override
	public User updateUser(int id, User updatedUser) {
		Optional<User> optionalUser = userRepo.findById(id);

		if (optionalUser.isPresent()) {
			User user = optionalUser.get();

			user.setUserEmail(updatedUser.getUserEmail());
			user.setUserName(updatedUser.getUserName());
			user.setPassword(updatedUser.getPassword());

			return userRepo.save(user);
		} else {
			throw new IllegalArgumentException("User with ID " + id + " not found");
		}

	}

	@Override
	public User save(User user) {

		return userRepo.save(user);
	}
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		return null;
	}

	



}
