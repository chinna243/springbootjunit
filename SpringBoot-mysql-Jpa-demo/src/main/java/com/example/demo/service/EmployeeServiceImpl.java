package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.EmployeeDaoImpl;
import com.example.demo.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDaoImpl employeedaoimpl;

	@Override
	public List<Employee> findAll() {
		 List<Employee> employees=employeedaoimpl.findAll();
		 System.out.println("getting data from db "+employees);
		return employees;
	}

	@Override
	public Employee FindById(int eid) {
		return employeedaoimpl.findById(eid).get();
		// TODO Auto-generated method stub
 
	}

	@Override
	public void save(Employee employee) {
		employeedaoimpl.save(employee);

	}

	@Override
	public void update(Employee employee,int eid) {
		employeedaoimpl.save(employee);

	}

	@Override
	public void delete(int eid) {
		employeedaoimpl.deleteById(eid);

	}

	@Override
	public List<Employee> findByEname(String ename) {
		// TODO Auto-generated method stub
		return employeedaoimpl.findByEname(ename);
	}

	@Override
	public List<Employee> findByEsal(double esal) {
		// TODO Auto-generated method stub
		return employeedaoimpl.findByEsal(esal);
	}

}
