package com.OnlineNurseryApplication.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class JwtAuthResponse {
	
	private Collection<? extends GrantedAuthority> authorities;
	private String username;
	private String token;
}
