package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.exception.AppointNotFoundException;
import com.example.demo.repository.IAppointmentRepository;

@Service
public class AppoinmentServiceImpl implements IAppointmentService {

	@Autowired
	IAppointmentRepository appointRepo;

	@Override
	public Appointment addAppoint(Appointment appoint) {
		Appointment newappoint = appointRepo.save(appoint);
		return newappoint;
	}

	@Override
	public List<Appointment> getAllAppoint() {
		List<Appointment> allappoint = appointRepo.findAll();
		return allappoint;
	}

	@Override
	public Appointment viewAppoint(int appointId) throws AppointNotFoundException{
		Optional<Appointment> appointOpt = appointRepo.findById(appointId);
		if(appointOpt.isPresent()) {
			Appointment appoint = appointOpt.get();
			return appoint;
		}else {
			throw new AppointNotFoundException("Appointment not found with given id: " + appointId);
		}
		

	}

}
