package com.OnlineNurseryApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineNurseryApplication.dto.SignInRequest;
import com.OnlineNurseryApplication.dto.SignUpRequest;
import com.OnlineNurseryApplication.repositories.RoleRepository;
import com.OnlineNurseryApplication.repositories.UserRepository;
import com.OnlineNurseryApplication.security.JwtAuthResponse;
import com.OnlineNurseryApplication.security.JwtTokenUtil;
import com.OnlineNurseryApplication.services.AuthenticationServiceImpl;
import com.OnlineNurseryApplication.services.UserServiceImpl;

import jakarta.validation.Valid;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.OnlineNurseryApplication.entities.User;
import com.OnlineNurseryApplication.exceptions.InvalidCredentialsException;
import com.OnlineNurseryApplication.exceptions.UserFoundException;
import com.OnlineNurseryApplication.entities.Role;
import java.util.Set;
import java.util.HashSet;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/auth/")
public class AuthController {

	@Autowired
	private AuthenticationServiceImpl authService;

	@PostMapping("/login")
	public ResponseEntity<JwtAuthResponse> SignIn(@Valid @RequestBody SignInRequest request) throws Exception,InvalidCredentialsException{
		System.out.println("Entering login");
		// this.authenticate(request.getEmail(), request.getPassword());

		JwtAuthResponse response = authService.signIn(request);
		return new ResponseEntity<JwtAuthResponse>(response, HttpStatus.OK);
	}

	@PostMapping("/SignUp")
	public ResponseEntity<String> registerUser(@Valid @RequestBody SignUpRequest request) throws UserFoundException {

		String response = authService.signUp(request);
		return new ResponseEntity<String>(response, HttpStatus.OK);

	}

}
