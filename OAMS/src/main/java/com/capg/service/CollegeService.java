package com.capg.service;

import java.util.List;

import com.capg.entity.College;
import com.capg.exception.CollegeNotFoundException;

public interface CollegeService {

	public College saveCollege(College college);

	public List<College> fetchCollegeList();

	public College fetchCollegeById(Integer collegeId) throws CollegeNotFoundException;

	public void deleteCollegeById(Integer collegeId);

	public College updateCollege(Integer collegeId, College college);

	public College fetchCollegeByName(String collegeName); 
	
	
}
