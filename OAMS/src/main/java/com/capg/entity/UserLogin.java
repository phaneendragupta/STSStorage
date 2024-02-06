
package com.capg.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Login")

public class UserLogin {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
	
	@Email @NotNull(message = "Email Must not be Null")
	private String email ;
	@NotNull(message = "PassWord Must not be Null")
	private String password;
}
