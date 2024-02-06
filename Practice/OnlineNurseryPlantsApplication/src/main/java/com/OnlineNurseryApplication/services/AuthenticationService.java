package com.OnlineNurseryApplication.services;

import com.OnlineNurseryApplication.dto.SignInRequest;
import com.OnlineNurseryApplication.dto.SignUpRequest;
import com.OnlineNurseryApplication.exceptions.InvalidCredentialsException;
import com.OnlineNurseryApplication.exceptions.UserFoundException;
import com.OnlineNurseryApplication.security.JwtAuthResponse;

public interface AuthenticationService {
	String signUp(SignUpRequest request) throws UserFoundException;

	JwtAuthResponse signIn(SignInRequest request) throws Exception,InvalidCredentialsException;
}
