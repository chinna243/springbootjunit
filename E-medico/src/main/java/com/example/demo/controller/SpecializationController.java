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
import com.example.demo.entity.Specialization;
import com.example.demo.service.AddressService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.HospitalService;
import com.example.demo.service.SpecializationService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/specialization")
public class SpecializationController {

	@Autowired
	private SpecializationService specializationService;

	public String sayhello() {

		return "specialization API";

	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Specialization>> findAll() {

		return ResponseEntity.status(HttpStatus.OK).body(specializationService.findAll());
	}

	@GetMapping("/findById/{sid}")
	public ResponseEntity<Specialization> findById(Integer sid) {

		return ResponseEntity.status(HttpStatus.OK).body(specializationService.FindById(sid));
	}

	@PostMapping("/save")
	public ResponseEntity<Specialization> save(@RequestBody Specialization specialization) {
		return ResponseEntity.status(HttpStatus.CREATED).body(specializationService.save(specialization));
	}

	@PostMapping("/update")
	public ResponseEntity<Specialization> update(@RequestBody Specialization specialization) {
		return ResponseEntity.status(HttpStatus.OK).body(specializationService.save(specialization));

	}

	@DeleteMapping("/deleteById/{sid}")
	public ResponseEntity<?> deleteById(Integer sid) {

		specializationService.deleteById(sid);

		Map<String, String> responMap = new HashMap<String, String>() {

			{
				put("response", "deleted sucessfully");

			}

		};
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responMap);

	}

}
