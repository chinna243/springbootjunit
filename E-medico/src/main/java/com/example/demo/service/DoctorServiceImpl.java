package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Specialization;
import com.example.demo.exception.DoctorAlreadyException;
import com.example.demo.exception.NosuchDoctorExistsException;
import com.example.demo.repository.Doctorrepository;
import com.example.demo.repository.Hospitalrepository;
import com.example.demo.util.EmailSender;
@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private Doctorrepository doctorrepository;
	@Autowired
	private EmailSender emailSender;

	@Override
	public List<Doctor> findAll() {
		
		return doctorrepository.findAll();
	}

	@Override
	public Doctor FindById(Integer did) {
		
		return doctorrepository.getById(did);
	}

	@Override
	public Doctor save(Doctor doctor) {
		
		emailSender.sendSimpleMail("noreply@createiq.com", "saichin na243@gmail.com", "hi this doctor email", "email via emedico project");
		
		Doctor  existingCustomer=doctorrepository.findById(doctor.getId()).orElse(null);
		if(existingCustomer==null) {
		
			 doctorrepository.save(doctor);
		} 
		
		else
			throw  new DoctorAlreadyException("doctor already exists");
		return existingCustomer;
		
	}

	@Override
	public Doctor update(Doctor doctor) {
		
		Doctor  existingCustomer=doctorrepository.findById(doctor.getId()).orElse(null);
		
		if(existingCustomer==null) 
			throw new NosuchDoctorExistsException("no suchdoctor is exists");
		
		else {
		 return doctorrepository.save(doctor);
		 
		}
	}

	@Override
	public void deleteById(Integer did) {

		doctorrepository.deleteById(did);
		
	}

}
