package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

 List<Employee> findAll();

	Employee FindById(int eid);

 void save(Employee employee);

	 void update(Employee employee, int eid);

	void delete(int eid);

	List<Employee> findByEname(String ename);
	
	List<Employee> findByEsal(double esal);
	
	
	

	

}
