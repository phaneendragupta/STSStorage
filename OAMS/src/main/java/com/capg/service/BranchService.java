package com.capg.service;

import java.util.List;

import com.capg.entity.Branch;

public interface BranchService {

	public Branch saveBranch(Branch branch);

	public List<Branch> fetchBranchList();

}
