package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

	public College findByCollegeName(String collegeName);

 	public College findByCollegeNameIgnoreCase(String collegeName);

}
