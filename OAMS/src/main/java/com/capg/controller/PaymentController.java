//package com.capg.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.capg.entity.Application;
////import com.capg.entity.Course;
////import com.capg.entity.Document;
//import com.capg.entity.Payment;
//import com.capg.service.PaymentService;
//
//@RestController
//@RequestMapping("/payment")
//public class PaymentController {
//	
//	@Autowired
//	PaymentService paymentService;
//
//		
//		@PostMapping("/create")
//		public Payment savePayment(@RequestBody Payment payment) {
//			return paymentService.savePayment(payment);
//		}
//		
//
//		@GetMapping("/getall")
//		public List<Payment> fetchPaymentList(){
//			return paymentService.fetchPaymentList();
//			
//		}
//		
//		@GetMapping("/get/{id}")
//		public Payment fetchPaymentById(@PathVariable("id") Integer paymentId) {
//			return paymentService.fetchPaymentById(paymentId);
//			
//		}
//		
//		@DeleteMapping("/del/{id}")
//		public String deletePaymentById(@PathVariable("id") Integer paymentId) {
//			paymentService.deletePaymentById(paymentId);
//			return "Payment data deleted";
//		}
//		
//
//		@PutMapping("/update/{id}")
//		public Payment updatePaymentDetails(@PathVariable("id") Integer paymentId ,@RequestBody Payment payment) {
//		 return  paymentService.updatePaymentDetails(paymentId,payment);
//		}
//
//	}
//	
//	
//	
//
