package com.capg.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
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
@Table(name = "branch")
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "branchId")
	private int branchId;
	private String branchName;
	private String branchDes;
	

}
