

package com.capg.controller;-



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Application;

import com.capg.service.ApplicationService;
//import com.capg.service.PaymentService;

@CrossOrigin(origins="http://localhost:3000")

@RestController
@RequestMapping("/Application")
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;

	/*
	 * @Autowired private PaymentService paymentService;
	 */
	@PostMapping("/create")
	public Application saveApplication(@RequestBody Application application) {
		return applicationService.saveApplication(application);
	}
		
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteApplicationById(@PathVariable("id") Integer appId) {
		applicationService.deleteApplicationById(appId);
		return "Application deleted";
	}	
	
	
	@GetMapping("/getallapps")
	public List<Application> fetchApplicationList(){
		return applicationService.fetchApplicationList();
		
	}
	
	@GetMapping("/app/{id}")
	public Application fetchApplicationById(@PathVariable("id") Integer appId) {
		return applicationService.fetchApplicationById(appId);
		
	}
	
	@PutMapping("/update/{id}")
	public Application updateApplication(@PathVariable("id") Integer appId,@RequestBody Application application){
		return  applicationService.updateApplication(appId,application);
		
	}
	
	

	

}
