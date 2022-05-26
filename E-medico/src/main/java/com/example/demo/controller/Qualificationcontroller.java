package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Address;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Qualification;
import com.example.demo.entity.Specialization;
import com.example.demo.service.AddressService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.HospitalService;
import com.example.demo.service.QualificationService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/qualification")
public class Qualificationcontroller {

	@Autowired
	private 	QualificationService qualificationService;

	public String sayhello() {

		return "Hospital API";

	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Qualification>> findAll() {

		return ResponseEntity.status(HttpStatus.OK).body(qualificationService.findAll());
	}

	@GetMapping("/findById/{qid}")
	public ResponseEntity<Qualification> findById(Integer qid) {

		return ResponseEntity.status(HttpStatus.OK).body(qualificationService.FindById(qid));
	}

	@PostMapping("/save")
	public ResponseEntity<Qualification> save(@RequestBody Qualification qualification) {
		return ResponseEntity.status(HttpStatus.CREATED).body(qualificationService.save(qualification));
	}

	@PostMapping("/update")
	public ResponseEntity<Qualification> update(@RequestBody Qualification qualification) {
		return ResponseEntity.status(HttpStatus.OK).body(qualificationService.save(qualification));

	}

	@DeleteMapping("/deleteById/{hid}")
	public ResponseEntity<?> deleteById(Integer qid) {

		qualificationService.deleteById(qid);

		Map<String, String> responMap = new HashMap<String, String>() {

			{
				put("response", "deleted sucessfully");

			}

		};
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responMap);

	}

}
