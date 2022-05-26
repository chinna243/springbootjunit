package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Address;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Qualification;
import com.example.demo.entity.Specialization;



public interface SpecializationService {
	
	
	 List<Specialization> findAll();

	 Specialization FindById(Integer sid);

	 Specialization save(Specialization specialization);

	 Specialization update(Specialization specialization);

		//void delete(Integer aid);

		void deleteById(Integer sid);

}
