package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	private AddressService addressservice;
	
	public String sayhello() {
		
		return "Address API";
		
	}
	
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Address>> findAll(){
		
		return ResponseEntity.status(HttpStatus.OK).body(addressservice.findAll());
	}
	
	@GetMapping("/findById/{aid}")
	public ResponseEntity<Address> findById(Integer aid){
		
		return ResponseEntity.status(HttpStatus.OK).body(addressservice.FindById(aid));
	}
	
	


}
