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
import com.example.demo.service.AddressService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.HospitalService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/doctor")
public class DoctorController {

	
	@Autowired
	private DoctorService doctorService;

	
	public String sayhello() {

		return "doctor API";

	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Doctor>> findAll() {

		return ResponseEntity.status(HttpStatus.OK).body(doctorService.findAll());
	}

	@GetMapping("/findById/{did}")
	public ResponseEntity<Doctor> findById(Integer did) {

		return ResponseEntity.status(HttpStatus.OK).body(doctorService.FindById(did));
	}

	@PostMapping("/save")
	public ResponseEntity<Doctor> save(@RequestBody Doctor doctor) {
		return ResponseEntity.status(HttpStatus.CREATED).body(doctorService.save(doctor));
	}

	@PostMapping("/update")
	public ResponseEntity<Doctor> update(@RequestBody Doctor doctor) {
		return ResponseEntity.status(HttpStatus.OK).body(doctorService.save(doctor));

	}

	@DeleteMapping("/deleteById/{did}")
	public ResponseEntity<?> deleteById(Integer did) {

		doctorService.deleteById(did);

		Map<String, String> responMap = new HashMap<String, String>() {

			{
				put("response", "deleted sucessfully");

			}

		};
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responMap);

	}

}
