
package com.capg.entity;

	
import java.util.ArrayList;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity // annotation specifies that the class is an entity and is mapped to a database table

public class Admission {
	@Id // annotation specifies the primary key of an entity
    @GeneratedValue(strategy = GenerationType.AUTO) // annotation provides for the specification of generation strategies for the values of primary keys
	private int admissionId;
	//private int applicantionId;
	private String course;
//    @NotNull(message = "Enter Status")
//    private AdmissionStatus status;
	
	}

	



