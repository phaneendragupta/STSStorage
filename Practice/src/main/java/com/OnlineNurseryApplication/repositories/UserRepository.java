package com.OnlineNurseryApplication.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.OnlineNurseryApplication.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	// Here the fields in the query should be according to your entity.
	 @Query("""
			    SELECT u FROM User u WHERE u.userName = :username """)
			  Optional<User> findUserByuserName(String username);
	 @Query("""
			    SELECT u FROM User u WHERE u.userEmail = :useremail """)
	 		Optional<User> findUserByuserEmail(String useremail);
	 

}


