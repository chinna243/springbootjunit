package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.EmployeeDaoImpl;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
 public class SpringBootH2JpaDemoApplicationTests {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@MockBean
	private EmployeeDaoImpl employeeDaoImpl;
	
	@Test
	public void findAllTest() {
		when(employeeDaoImpl.findAll()).thenReturn(Stream.of(new Employee(101, "saikrishna", 120000),new Employee(102, "vamshikrishna", 850000)).collect(Collectors.toList()));
		assertEquals(2, employeeServiceImpl.findAll().size());
	}

	
}
