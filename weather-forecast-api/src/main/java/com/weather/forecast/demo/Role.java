package com.weather.forecast.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Role{

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer user_id;

private String user_fname;
private String user_lname;
private String user_email;
private String user_pass;
private String user_mobile;



@Override
public String toString() {
	return "User [id=" + user_id + ", user_fname=" + user_fname + ", user_lname=" + user_lname + ", user_email="
			+ user_email + ", user_pass=" + user_pass + ", user_mobile=" + user_mobile + "]";
	}
	
	
}


