package com.capg.entity;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
	
	private HttpStatus status;
	private String message;
 
}
