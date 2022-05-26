package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Address;
import com.example.demo.entity.Hospital;



public interface HospitalService {
	
	
	 List<Hospital> findAll();

	 Hospital FindById(Integer hid);

	 Hospital save(Hospital hospital);

		 Hospital update(Hospital hospital);

		//void delete(Integer aid);

		void deleteById(Integer hid);

}
