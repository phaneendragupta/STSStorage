package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DoctorDto;
import com.example.demo.entity.Doctor;
import com.example.demo.exception.DoctorNotFoundException;
import com.example.demo.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	IDoctorRepository docRepo;
	
	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		List<Doctor> doctors=docRepo.findAll();
		return doctors;
	}

	@Override
	public Doctor getDocById(int docId) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		Optional<Doctor> doctor=docRepo.findById(docId);
		if(doctor.isPresent()) {
			return doctor.get();
		}
		else {
			throw new DoctorNotFoundException("Doctor not Found with the given ID: "+docId);
		}
	}

	@Override
	public Doctor addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		Doctor doctor=docRepo.save(doc);
		return doctor;
	}

	@Override
	public Doctor updateDoctorById(int docId, Doctor doc) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		Optional<Doctor> docOpt=docRepo.findById(docId);
		if(docOpt.isPresent()) {
			Doctor updatedDoctor=docOpt.get();
			docRepo.save(doc);
			return updatedDoctor;
		}
		else {
			throw new DoctorNotFoundException("Doctor not Found with the given ID: "+docId);
		}
	}

	@Override
	public Doctor deleteDoctor(int docId) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		Optional<Doctor> docOpt=docRepo.findById(docId);
		if(docOpt.isPresent()) {
			Doctor updatedDoctor=docOpt.get();
			docRepo.deleteById(docId);
			return updatedDoctor;
		}
		else {
			throw new DoctorNotFoundException("Doctor not Found with the given ID: "+docId);
		}
	}

	@Override
	public List<DoctorDto> getAllDoctorDto() {
		// TODO Auto-generated method stub
		List<Doctor> doctors=docRepo.findAll();
		List<DoctorDto> doctorDtoList=new ArrayList<>();
		for(Doctor doctor:doctors) {
			DoctorDto doctorDto=new DoctorDto();
			doctorDto.setDocName(doctor.getDoctorName());
			doctorDtoList.add(doctorDto);
		}
		return doctorDtoList;
	}
	
	@Override
	public Doctor getDocByName(String name) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		Optional<Doctor> viewDoc = docRepo.findBydoctorName(name);
		if(viewDoc.isPresent()) {
			return viewDoc.get();
		} else {
			throw new DoctorNotFoundException("Doctor not found with the given Name: "+name);
		}
	}

}
