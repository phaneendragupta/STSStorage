package com.capg.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Payment
 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "paymentId")
	private int paymentId;
	private String emailId;
	//private int applicationId;
	private double paymentAmount;
	private String paymentDescription;
//	//private LocalDate paymentDate;
	private String  paymentStatus;
	
	 // @OneToOne(mappedBy="payment") 
// private Application application;
	  
	 
}