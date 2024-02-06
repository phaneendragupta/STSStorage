package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Branch;
import com.capg.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService{
	
	@Autowired
	private BranchRepository branchRepository;

	@Override
	public Branch saveBranch(Branch branch) {
		
		return branchRepository.save(branch);
	}

	@Override
	public List<Branch> fetchBranchList() {
		
		return branchRepository.findAll();
	}

}
