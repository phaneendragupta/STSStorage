package com.capg.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "college")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collegeId;
	private String collegeName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "collegeId", referencedColumnName = "collegeId")
	private List<Course> courses;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "collegeId", referencedColumnName = "collegeId")
	private List<Branch> branches;
 	
	

}
