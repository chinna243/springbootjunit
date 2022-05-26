package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Address;
import com.example.demo.repository.Addressrepository;
@Service
public class AddressServiceImpl  implements AddressService{
	@Autowired
	private Addressrepository addressrepository;

	@Override
	public  List<Address> findAll() {
				return addressrepository.findAll();
	}

	@Override
	public Address FindById(Integer aid) {
		
		return addressrepository.getById(aid);
		
	}

	@Override
	public Address save(Address address) {
		return addressrepository.save(address);
		
	}

	@Override
	public Address update(Address address, Integer aid) {
		return addressrepository.save(address);
		
	}

	@Override
	public void deleteById(Integer aid) {
		addressrepository.deleteById(aid);
		
	}

	

}
