package com.capg.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Application;

import com.capg.entity.Payment;
import com.capg.exception.IdNotFoundException;
import com.capg.repository.ApplicationRepository;
//import com.capg.repository.PaymentRepository;
@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService  {
	
	@Autowired
	ApplicationRepository applicationRepository;

	
	 // @Autowired PaymentRepository paymentRepository;
	 	
	@Override
	public Application saveApplication(Application application) {
	
		return applicationRepository.save(application);
	}
		/*
		 * Payment payment = new Payment();
		 * payment.setPaymentId(application.getPayment().getPaymentId());
		 * payment.setEmailId(application.getPayment().getEmailId());
		 * payment.setPaymentAmount(application.getPayment().getPaymentAmount());
		 * 
		 * payment.setPaymentDescription(application.getPayment().getPaymentDescription(
		 * ));
		 * 
		 * payment.setPaymentStatus(application.getPayment().getPaymentStatus());
		 * 
		 * 
		 * paymentRepository.save(payment);
		 * 
		 * 
		 */
		 
	

	@Override
	public List<Application> fetchApplicationList() {
		// TODO Auto-generated method stub
		
		return applicationRepository.findAll();
		
		
	}

	@Override
	public Application fetchApplicationById(Integer appId) {
		// TODO Auto-generated method stub
		return applicationRepository.findById(appId).get();
	}

	@Override
	public void deleteApplicationById(Integer appId) {
		// TODO Auto-generated method stub
		applicationRepository.deleteById(appId);
	}

	@Override
	public Application updateApplication(Integer appId, Application application) {
		Application application1 = applicationRepository.findById(appId)
				.orElseThrow(() -> new IdNotFoundException("Application details not found: "));
	application1.setAppName(application.getAppName());
	application1.setQualification(application.getQualification());
	application1.setPercent(application.getPercent());
	
	application1.setAppStatus(application.getAppStatus());
	
	application1.setCourseId(application.getCourseId());
	application1.setPayment(application.getPayment());
		return applicationRepository.save(application1);
	
	}
	
		
		

	
		
}





