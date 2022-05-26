package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Address;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Qualification;



public interface QualificationService {
	
	
	 List<Qualification> findAll();

	 Qualification FindById(Integer qid);

	 Qualification save(Qualification qualification);

	 Qualification update(Qualification Qualification);

		//void delete(Integer aid);

		void deleteById(Integer qid);

}
