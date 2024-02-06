package com.weather.app.demo.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor

public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roleId;

	@Column
	private String role_name;

	//mappedBy to establish a bidirectional relationship
	@ManyToMany(mappedBy = "roles")
	private Set<User> weatherUsers;


}


































//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@Entity
//@Table(name="roles")
//@AllArgsConstructor
//@NoArgsConstructor
//public class Role {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int roleId;
//	private String roleName;
//	
//	public Role(String roleName) {
//		super();
//		this.roleName = roleName;
//	}
//
//
////	@OneToOne(cascade = CascadeType.ALL)
////	@JoinColumn(name ="admin_login_id")
//  //  private User user;
//
//
//
//}
