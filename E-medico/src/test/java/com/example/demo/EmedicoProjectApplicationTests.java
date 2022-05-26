package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.controller.DoctorController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EmedicoProjectApplicationTests {
	
	@Autowired
	private DoctorController doctorController;
     @Test
	public  void contextLoads() {
    	 
    	Assertions.assertThat(doctorController).isNotNull();
		
		
	}
	
	
	
}
