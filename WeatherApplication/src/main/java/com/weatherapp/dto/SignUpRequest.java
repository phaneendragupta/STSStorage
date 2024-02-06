package com.weatherapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class SignUpRequest {

	@NotNull
	 private String username;


	@Email
	@NotNull
	private String email;
	
	@NotNull
	private String password;
	 
	 public SignUpRequest(String username, String email, String password) {
			super();
			this.username = username;
			this.email = email;
			this.password = password;
		}
	 
}

