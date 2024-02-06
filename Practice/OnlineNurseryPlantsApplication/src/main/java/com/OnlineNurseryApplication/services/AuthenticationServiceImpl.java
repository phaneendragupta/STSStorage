package com.OnlineNurseryApplication.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.OnlineNurseryApplication.dto.SignInRequest;
import com.OnlineNurseryApplication.dto.SignUpRequest;
import com.OnlineNurseryApplication.entities.Role;
import com.OnlineNurseryApplication.entities.User;
import com.OnlineNurseryApplication.exceptions.InvalidCredentialsException;
import com.OnlineNurseryApplication.exceptions.UserFoundException;
import com.OnlineNurseryApplication.repositories.UserRepository;
import com.OnlineNurseryApplication.security.JwtAuthResponse;
import com.OnlineNurseryApplication.security.JwtTokenUtil;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	private static Logger logger = LogManager.getLogger();

	@Autowired
	UserRepository userRepo;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	AuthenticationManager authManager;

	@Autowired
	UserServiceImpl userService;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@Override
	public String signUp(SignUpRequest request) throws UserFoundException {
		logger.info("checking for the presence of user object with the given name");
		Optional<User> userOpt = userRepo.findUserByuserName(request.getUsername());
		Optional<User> userOpt1 = userRepo.findUserByuserEmail(request.getEmail());

		
		if (userOpt.isPresent()) {
			throw new UserFoundException(
					"Given email address " + request.getEmail() + " present already! Choose different one");
		} else if (userOpt1.isPresent()) {
			throw new UserFoundException(
					"Given user name " + request.getUsername() + " present already! Choose different one");
		}
		else {
		User user = new User();
		System.out.println("entering");
		System.out.println(request.getUsername());
		user.setUserName(request.getUsername());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		user.setUserEmail(request.getEmail());
		Role role1 = new Role();
		role1.setRole_name("USER");
		Set<Role> roles = new HashSet<>();
		roles.add(role1);
		user.setRoles(roles);
		user.setAddress(request.getAddress());
		

		userRepo.save(user);

		return "User created Successfully";
		}
	}

	@Override
	public JwtAuthResponse signIn(SignInRequest request) throws Exception,InvalidCredentialsException {
		try {
			UsernamePasswordAuthenticationToken uptoken = new UsernamePasswordAuthenticationToken(request.getEmail(),
					request.getPassword());
			System.out.println(uptoken);
			Authentication auth = authManager
					.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
			System.out.println(auth.getPrincipal());
			System.out.println(auth);
			UserDetails userDetails = userService.loadUserByUsername(request.getEmail());
			String token = jwtTokenUtil.generateToken(userDetails.getUsername());

			JwtAuthResponse response = new JwtAuthResponse();
			response.setToken(token);
			response.setAuthorities(userDetails.getAuthorities());
			response.setUsername(request.getEmail());
			return response;

		} catch (BadCredentialsException e) {
			System.out.println("Invalid Details");
			throw new InvalidCredentialsException("Invalid Username or password");
		}
	}

}
