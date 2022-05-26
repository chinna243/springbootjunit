package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Qualification;
import com.example.demo.entity.Specialization;
import com.example.demo.repository.Hospitalrepository;
import com.example.demo.repository.Qualificationrepository;
import com.example.demo.repository.Specializationrepository;
@Service
public class SpecializationServiceImpl implements SpecializationService {
	
	@Autowired
	private Specializationrepository specializationrepository;

	@Override
	public List<Specialization> findAll() {
		
		return specializationrepository.findAll();
	}

	@Override
	public Specialization FindById(Integer sid) {
		
		return specializationrepository.getById(sid);
	}

	@Override
	public Specialization save(Specialization specialization) {
	
		return specializationrepository.save(specialization);
	}

	@Override
	public Specialization update(Specialization specialization) {
		return specializationrepository.save(specialization);
		
	}

	@Override
	public void deleteById(Integer sid) {

		specializationrepository.deleteById(sid);
		
	}

}
