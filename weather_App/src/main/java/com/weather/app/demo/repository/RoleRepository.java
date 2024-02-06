package com.weather.app.demo.repository;
//
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.weather.app.demo.entity.Role;
//
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

//Role findByRoleName(String roleName);
//
//Role save (Role role); 
}
