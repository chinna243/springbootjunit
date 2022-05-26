package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;

public interface Addressrepository extends JpaRepository<Address, Integer> {

}
