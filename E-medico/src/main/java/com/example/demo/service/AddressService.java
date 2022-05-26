package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Address;



public interface AddressService {
	
	
	 List<Address> findAll();

	 Address FindById(Integer aid);

	 Address save(Address address);

	 Address update(Address address, Integer aid);

		//void delete(Integer aid);

		void deleteById(Integer aid);

}
