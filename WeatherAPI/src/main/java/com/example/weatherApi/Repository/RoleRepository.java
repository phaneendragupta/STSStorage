package com.example.weatherApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.weatherApi.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
   // Role findByName(String roleName);
}
