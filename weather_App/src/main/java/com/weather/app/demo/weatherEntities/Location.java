package com.weather.app.demo.weatherEntities;


import java.util.HashSet;
import java.util.Set;

import com.weather.app.demo.entity.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table

public class Location {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;

    // Define the many-to-many relationship with users
//    @ManyToMany(mappedBy = "favoriteLocations")
    private Set<User> users = new HashSet<>();

	@Override
	public String toString() {
		return "Location [id=" + id + ", city=" + city + ", users=" + users + "]";
	}


}
