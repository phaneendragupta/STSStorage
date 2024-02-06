package com.example.demo.dto;

import lombok.Data;


@Data
public class LoginDto{
	
	private String loginEmail;
	private String loginPassword;
	private String role;
	private Boolean isLoggedIn;

}