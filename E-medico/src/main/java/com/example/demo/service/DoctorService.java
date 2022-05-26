package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Address;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;



public interface DoctorService {
	
	
	 List<Doctor> findAll();

	 Doctor FindById(Integer did);

	 Doctor save(Doctor doctor);

	 Doctor update(Doctor doctor);

		//void delete(Integer aid);

		void deleteById(Integer did);

}
