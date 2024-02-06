package com.OnlineNurseryApplication.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.OnlineNurseryApplication.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Integer>{
	
	Optional<Role> findByroleId(Integer id);
	
	 @Query("""
			    SELECT r FROM Role r WHERE r.role_name = :name """)

	Optional<Role> findByrole_name(String name);

}
