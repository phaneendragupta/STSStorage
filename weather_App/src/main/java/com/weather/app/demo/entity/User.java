package com.weather.app.demo.entity;


import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer id;
	@Column
	@NotNull(message = "Name shouldn't be empty")
	private String userName;
	@Column(length = 50)
	@Email(message = "Enter valid email address")
	@NotNull
	private String userEmail;
	@Column
	@NotBlank
	private String password;

	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)

	@JoinTable(name = "user_roles",
				joinColumns = @JoinColumn(name = "user_id"),
				inverseJoinColumns = @JoinColumn(name = "role_id")
			)
	@JsonIgnore
	private Set<Role> roles;

//
//	@Override
//	@JsonIgnore
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return userEmail;
//	}
//
//	@Override
//	@JsonIgnore
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	@JsonIgnore
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	@JsonIgnore
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	@JsonIgnore
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}

//		@Override
//	public String toString() {
//		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", password=" + password
//				+ "]";
//	}

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)

	@JsonIgnore

	private List<City> recentSearches;



	public void addRecentSearch(City city) {

		recentSearches.add(city);

		city.setUser(this);

	}



//	public List<City> getRecentSearches() {
//		return recentSearches;
//	}
//
//	public void setRecentSearches(List<City> recentSearches) {
//		this.recentSearches = recentSearches;
//	}
//
//	public Set<Location> getFavoriteLocations() {
//		return favoriteLocations;
//	}
//
//	public void setFavoriteLocations(Set<Location> favoriteLocations) {
//		this.favoriteLocations = favoriteLocations;
//	}


}




































































//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.management.relation.Role;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//@Data
//@Entity
//@Table(name="users")
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class User{
//	
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int userId;
//	
//	private String userName;
//	private String userEmail;
//	
//	private String password;
//	
//	//private String role;
//	
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinTable(
//			name="user_roles",
//	        joinColumns = @JoinColumn(
//	                 name ="user_id",referencedColumnName="userId"),
//	        inverseJoinColumns =@JoinColumn(
//	            	 name = "role_id",referencedColumnName="roleId")
//			)
//	private List<Role> roles ;
////	
////	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
////	@JoinTable(
////			name="user_roles",
////	        joinColumns = @JoinColumn(
////	                 name ="user_id", referencedColumnName = "id"),
////	        inverseJoinColumns =@JoinColumn(
////	            	 name = "role_id", referencedColumnName = "id"
////	            		 ))
////	
//
//	public User(String userName, String userEmail, String password, List<Role> roles) {
//		super();
//		this.userName = userName;
//		this.userEmail = userEmail;
//		this.password = password;
//		this.roles = roles;
//	}
//
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//
//	@JsonIgnore
//
//	private List<City> recentSearches;
//
//
//
//	public void addRecentSearch(City city) {
//
//		recentSearches.add(city);
//
//		city.setUser(this);
//
//	}
//
//	public List<City> getRecentSearches() {
//		return recentSearches;
//	}
//
//	public void setRecentSearches(List<City> recentSearches) {
//		this.recentSearches = recentSearches;
//	}
//	
//}




