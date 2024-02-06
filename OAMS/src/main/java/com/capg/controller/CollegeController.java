	package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.College;
import com.capg.exception.CollegeNotFoundException;
import com.capg.service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	private CollegeService collegeService;
	
	@PostMapping("/colleges")
	public College saveCollege(@RequestBody College college) {
		return collegeService.saveCollege(college);
	}
	
	@GetMapping("/colleges")
	public List<College> fetchCollegeList(){
		return collegeService.fetchCollegeList();
		
	}
	
	@GetMapping("/colleges/{id}")
	public College fetchCollegeById(@PathVariable("id") Integer collegeId) throws CollegeNotFoundException {
		return collegeService.fetchCollegeById(collegeId);
		
	}	
	
	@DeleteMapping("/colleges/{id}")
	public String deleteCollegeById(@PathVariable("id") Integer collegeId) {
		collegeService.deleteCollegeById(collegeId);
		return "College deleted";
	}
	
	@PutMapping("/colleges/{id}")
	public College updateCollege(@PathVariable("id") Integer collegeId, @RequestBody College college) {
		return collegeService.updateCollege(collegeId,college);
	}
	
	@GetMapping("/colleges/name/{name}")
    public College fetchCollegeByName(@PathVariable("name") String collegeName) {
        return collegeService.fetchCollegeByName(collegeName);
    }

}
