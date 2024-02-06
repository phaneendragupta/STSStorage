package com.capg.service;

import com.capg.entity.Application;

import java.util.List;


public interface ApplicationService {
	
	
	
	Application saveApplication(Application application);


	List<Application> fetchApplicationList();


	Application fetchApplicationById(Integer appId);




	void deleteApplicationById(Integer appId);


	Application updateApplication(Integer appId, Application application);
	
	





}