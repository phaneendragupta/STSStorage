//package com.capg.service;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.capg.entity.Payment;
//import com.capg.exception.IdNotFoundException;
//import com.capg.repository.PaymentRepository;
//
//
//@Service
//@Transactional
//public class PaymentServiceImpl implements PaymentService{
//	
//	@Autowired
//	private PaymentRepository paymentRepository;
//
//	@Override
//	public Payment savePayment(Payment payment) {
//		// TODO Auto-generated method stub
//		return paymentRepository.save(payment);
//	}
//
////	@Override
////	public List<Payment> fetchPaymentList() {
////		// TODO Auto-generated method stub
////		return paymentRepository.findAll() ;
////	}
//
////	@Override
////	public Payment fetchPaymentById(Integer paymentId) {
////		// TODO Auto-generated method stub
////		return paymentRepository.findById(paymentId).get();
////	}
//
//	@Override
//	public void deletePaymentById(Integer paymentId) {
//		// TODO Auto-generated method stub
//		paymentRepository.deleteById(paymentId);
//		
//	}
//
//	@Override
//	public Payment updatePaymentDetails(Integer paymentId, Payment payment) {
//	
//		Payment payment1 = paymentRepository.findById(paymentId)
//				.orElseThrow(() -> new IdNotFoundException("Payment details not found: "));
//		payment1.setEmailId(payment.getEmailId());
//		//payment1.setApplicationId(payment.getApplicationId());
//		payment1.setPaymentAmount(payment.getPaymentAmount());
//		payment1.setPaymentDescription(payment.getPaymentDescription());
//		payment1.setPaymentStatus(payment.getPaymentStatus());
//		//payment.setOrders(customerDTO.getOrders());
//		return paymentRepository.save(payment1);
//	   
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//
//}