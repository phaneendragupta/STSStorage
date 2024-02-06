package com.OnlineNurseryApplication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineNurseryApplication.entities.Address;
import com.OnlineNurseryApplication.exceptions.AddressNotFoundException;
import com.OnlineNurseryApplication.repositories.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepository addressRepo;

	@Override
	public String addAddress(Address address) {
		// TODO Auto-generated method stub
		addressRepo.save(address);
		return "Address Added Successfully";
	}

	@Override
	public String updateAddress(Integer addressId, Address naddress) throws AddressNotFoundException {
		// TODO Auto-generated method stub
		Optional<Address> address = addressRepo.findById(addressId);
		if(address.isPresent()) {
			Address newaddress = address.get();
			newaddress.setAddressId(naddress.getAddressId());
			newaddress.setCity(naddress.getCity());
			newaddress.setColony(naddress.getColony());
			newaddress.setHouseNo(naddress.getHouseNo());
			newaddress.setState(naddress.getState());
			newaddress.setPinCode(naddress.getPinCode());
			addressRepo.save(newaddress);
			return "Address update for the user" + newaddress.getUser().getUserName();
		}
		
		else {
			throw new AddressNotFoundException("Address not found");
		}
	}

	@Override
	public String DeleteAddress(Integer addId) throws AddressNotFoundException {
		Optional<Address> address = addressRepo.findById(addId);
		if(address.isPresent()) {
			addressRepo.delete(address.get());
			return "Address Deleted SuccessFully";
		}
		else {
			throw new AddressNotFoundException("Address Not found");
		}
		
	}

}
