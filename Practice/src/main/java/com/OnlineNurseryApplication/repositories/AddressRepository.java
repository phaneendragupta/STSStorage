package com.OnlineNurseryApplication.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineNurseryApplication.entities.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {
	List<Address> findByUserId(Integer userId);
	
	
}
