package com.OnlineNurseryApplication.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer addressId;
	
	@Column
	@NotNull
	private String houseNo;
	
	@Column
	@NotNull
	private String colony;
	
	@Column
	@NotNull
	private String city;
	
	@Column
	@NotNull
	private String state;
	
	@Column
	@NotNull
	private Integer pinCode;
	
//	@ManyToOne(cascade = CascadeType.ALL)//fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name="user_id", referencedColumnName="id")
//	private User user;
	
	@OneToOne(mappedBy = "address")
	@JsonIgnore
	private User user;

}
