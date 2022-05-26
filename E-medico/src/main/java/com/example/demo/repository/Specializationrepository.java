package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Specialization;

public interface Specializationrepository extends JpaRepository<Specialization, Integer> {

}
