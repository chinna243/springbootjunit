package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;



public interface EmployeeDaoImpl  extends JpaRepository<Employee, Integer>{
	 
	 
	

	
	
	List<Employee> findByEname(String ename);
	

	List<Employee> findByEsal(double esal);
	

}
