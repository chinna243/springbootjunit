package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Qualification;
import com.example.demo.repository.Hospitalrepository;
import com.example.demo.repository.Qualificationrepository;
@Service
public class QualificationServiceImpl implements QualificationService {
	
	@Autowired
	private Qualificationrepository qualificationrepository;

	@Override
	public List<Qualification> findAll() {
		
		return qualificationrepository.findAll();
	}

	@Override
	public Qualification FindById(Integer qid) {
		
		return qualificationrepository.getById(qid);
	}

	@Override
	public Qualification save(Qualification qualification) {
	
		return qualificationrepository.save(qualification);
	}

	@Override
	public Qualification update(Qualification Qualification) {
		return qualificationrepository.save(Qualification);
		
	}

	@Override
	public void deleteById(Integer qid) {

		qualificationrepository.deleteById(qid);
		
	}

}
