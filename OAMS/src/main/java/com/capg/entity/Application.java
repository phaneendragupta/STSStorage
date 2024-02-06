package com.capg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="application")
public class Application {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int appId;
	private String appName;
    private String qualification;
    private int percent;
	private String appStatus;
	private String courseId;
//	
//	  @OneToOne(cascade = {CascadeType.ALL})
//	  @JoinColumn(name="paymentId")
//	  private  Payment payment ;

	  @OneToOne(targetEntity = Payment.class, cascade = CascadeType.ALL)
	    @JoinColumn(name = "app_fk", referencedColumnName = "paymentId")
		private  Payment payment;
	 


//   @GeneratedValue(strategy=GenerationType.IDENTITY)

//    private int admissionId;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="admissionId")
//    private Admission admission;

    
   	}