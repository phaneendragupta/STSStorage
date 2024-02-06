package com.OnlineNurseryApplication.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

import com.OnlineNurseryApplication.entities.Role;

public class SecurityAuthority implements GrantedAuthority{
	
	
	@Autowired
	private Role role;
	
	@Override
	public String getAuthority() {
		return role.getRole_name();
	}

}
