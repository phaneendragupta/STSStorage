package com.OnlineNurseryApplication.dto;

import java.util.List;
import java.util.Set;

import com.OnlineNurseryApplication.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
	private String name;
	private String userEmail;
	
	private Address address;

	@Override
	public String toString() {
		return "UserDto [name=" + name + ", userEmail=" + userEmail + "]";
	}
	
}
