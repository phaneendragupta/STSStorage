package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Branch;
import com.capg.service.BranchService;

@RestController
public class BranchController {
	@Autowired
	private BranchService branchService;
	
	@PostMapping("/branches")
	public Branch saveBranch(@RequestBody Branch branch) {
		return branchService.saveBranch(branch);
	}
	
	@GetMapping("/branches")
	public List<Branch> fetchBranchList(){
		return branchService.fetchBranchList();
		
	}

}
