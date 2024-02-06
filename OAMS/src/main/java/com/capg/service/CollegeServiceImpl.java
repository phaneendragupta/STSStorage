package com.capg.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.College;
import com.capg.exception.CollegeNotFoundException;
import com.capg.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService{
	
	@Autowired
	private CollegeRepository collegeRepository;

	@Override
	public College saveCollege(College college) {
		
		return collegeRepository.save(college);
	}

	@Override
	public List<College> fetchCollegeList() {
		
		return collegeRepository.findAll();
	}

	@Override
	public College fetchCollegeById(Integer collegeId) throws CollegeNotFoundException {
		
		Optional<College> college = collegeRepository.findById(collegeId);
		
		if(!college.isPresent()) {
			throw new CollegeNotFoundException("College is not there");
		}
		return college.get();
	}

	@Override
	public void deleteCollegeById(Integer collegeId) {
		collegeRepository.deleteById(collegeId);
		
	}

	@Override
	public College updateCollege(Integer collegeId, College college) {
		College docDB = collegeRepository.findById(collegeId).get();
		
		if(Objects.nonNull(college.getCollegeName()) &&
		        !"".equalsIgnoreCase(college.getCollegeName())) {
		            docDB.setCollegeName(college.getCollegeName());
		        }
		
		return collegeRepository.save(docDB);
	}

	@Override
    public College fetchCollegeByName(String collegeName) {
        return collegeRepository.findByCollegeNameIgnoreCase(collegeName);
    }

}
