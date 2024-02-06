package com.OnlineNurseryApplication.services;

import com.OnlineNurseryApplication.entities.Address;
import com.OnlineNurseryApplication.exceptions.AddressNotFoundException;

public interface AddressService {
	
	String addAddress(Address address);
	
	String updateAddress(Integer addressId, Address address) throws AddressNotFoundException;
	
	String DeleteAddress(Integer addId) throws AddressNotFoundException;
	

}
