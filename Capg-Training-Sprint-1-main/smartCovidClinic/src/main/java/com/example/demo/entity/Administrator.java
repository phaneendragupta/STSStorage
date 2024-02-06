package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Administrator {
	
	@Id
	@GeneratedValue
	private int adminId;
	private String adminName;
	private String adminEmail;
	private String adminPassword;
	private String adminConfirmPassword;

}
