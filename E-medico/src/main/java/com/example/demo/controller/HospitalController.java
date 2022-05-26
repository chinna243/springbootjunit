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
import com.example.demo.entity.Hospital;
import com.example.demo.service.AddressService;
import com.example.demo.service.HospitalService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/hospital")
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;

	public String sayhello() {

		return "Hospital API";

	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Hospital>> findAll() {

		return ResponseEntity.status(HttpStatus.OK).body(hospitalService.findAll());
	}

	@GetMapping("/findById/{aid}")
	public ResponseEntity<Hospital> findById(Integer hid) {

		return ResponseEntity.status(HttpStatus.OK).body(hospitalService.FindById(hid));
	}

	@PostMapping("/save")
	public ResponseEntity<Hospital> save(@RequestBody Hospital hospital) {
		return ResponseEntity.status(HttpStatus.CREATED).body(hospitalService.save(hospital));
	}

	@PostMapping("/update")
	public ResponseEntity<Hospital> update(@RequestBody Hospital hospital) {
		return ResponseEntity.status(HttpStatus.OK).body(hospitalService.save(hospital));

	}

	@DeleteMapping("/deleteById/{hid}")
	public ResponseEntity<?> deleteById(Integer hid) {

		hospitalService.deleteById(hid);

		Map<String, String> responMap = new HashMap<String, String>() {

			{
				put("response", "deleted sucessfully");

			}

		};
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responMap);

	}

}
