package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Hospital;
import com.example.demo.repository.Hospitalrepository;
@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	private Hospitalrepository hospitalrepository;

	@Override
	public List<Hospital> findAll() {
		
		return hospitalrepository.findAll();
	}

	@Override
	public Hospital FindById(Integer hid) {
		
		return hospitalrepository.getById(hid);
	}

	@Override
	public Hospital save(Hospital hospital) {
	
		return hospitalrepository.save(hospital);
	}

	@Override
	public Hospital update(Hospital hospital) {
		return hospitalrepository.save(hospital);
		
	}

	@Override
	public void deleteById(Integer hid) {

		hospitalrepository.deleteById(hid);
		
	}

}
