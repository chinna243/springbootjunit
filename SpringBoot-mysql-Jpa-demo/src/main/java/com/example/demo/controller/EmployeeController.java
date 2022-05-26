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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/rest/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/employees")
	public List<Employee> findAll() {    
		return employeeservice.findAll();
	}

	
	@PostMapping("/employees")
	public void save(@RequestBody Employee e) {
		employeeservice.save(e);
	}

	@GetMapping("/employees/{eid}")
	public Employee findById(@PathVariable("eid") int eid) {
		return employeeservice.FindById(eid);
	}
	
	
//	@GetMapping("/employees/{ename}")
//	public ResponseEntity<Object> findByEname(@PathVariable("ename") String ename) {
//		List<Employee> employee=employeeservice.FindByEname(ename);
//		return ResponseEntity.ok(employee).status(HttpStatus.FOUND).build();
//	}
	
	@GetMapping("/findByEname/{ename}")
	public ResponseEntity<Object> findByEname(@PathVariable("ename") String ename) {
		List<Employee> employees = employeeservice.findByEname(ename);
		return ResponseEntity.status(HttpStatus.FOUND).body(employees);
	}
	
	
	@GetMapping("/findByEsal/{esal}")
	public ResponseEntity<Object> findByEsal(@PathVariable("esal") double esal) {
		List<Employee> employees = employeeservice.findByEsal(esal);
		return ResponseEntity.status(HttpStatus.FOUND).body(employees);
	}

	@DeleteMapping("/employees/{eid}")
	public ResponseEntity<Object> delete(@PathVariable int eid) {
		employeeservice.delete(eid);
		Map<String, Object>map=new HashMap<>();
		map.put("status", HttpStatus.OK);
		map.put("msg","Delete with id"+  eid); 
		return ResponseEntity.ok(map);
	}

	@PutMapping("/employees/{eid}")
	public void update(@RequestBody Employee e, @PathVariable int eid) {
		employeeservice.update(e, eid);
	}
	
	
}
