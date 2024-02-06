package com.weather.app.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.weather.app.demo.entity.User;
@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

	 @Query("""
			    SELECT u FROM User u WHERE u.userName = :username """)
			  Optional<User> findUserByuserName(String username);
	 @Query("""
			    SELECT u FROM User u WHERE u.userEmail = :useremail """)
	 		Optional<User> findUserByuserEmail(String useremail);

    User save (User user);

	
}