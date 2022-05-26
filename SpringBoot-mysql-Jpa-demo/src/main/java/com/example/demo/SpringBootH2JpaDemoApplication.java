package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SpringBootH2JpaDemoApplication implements ApplicationRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootH2JpaDemoApplication.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setEname("sorupakasai");
		e1.setEsal(85000.00);
		employeeService.save(e1);

		// System.out.println(e1);

		Employee e2 = new Employee();
		e2.setEid(2);
		e2.setEname("kalyanbomma");
		e2.setEsal(130000.00);
		employeeService.save(e2);
		// System.out.println(e2);

		Employee e3 = new Employee();
		e3.setEid(3);
		e3.setEname("saikrishna");
		e3.setEsal(120000.00);
		employeeService.save(e3);
		// System.out.println(e3);

		System.out.println(" ---------------@NamedQuery ---------------------");
		System.out.println("--------------findByEmailAddress -----------------");

		List<Employee> employee1 = (List<Employee>) employeeService.findByEname("saikrishna");
		System.out.println(employee1.toString());

		System.out.println(" ---------------@NamedQuery ---------------------");
		System.out.println("--------------findByEmailAddress -----------------");

		List<Employee> employee = (List<Employee>) employeeService.findByEsal(85000.00);
		System.out.println(employee.toString());

	}
}
