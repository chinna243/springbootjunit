package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.example.demo.controller.DoctorController;
import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorServiceImpl;

@ExtendWith(SpringExtension.class)
@WebMvcTest(DoctorController.class)
public class DoctorControllerTest {

	@MockBean
	private DoctorServiceImpl doctorServiceImpl;

	@Autowired
	MockMvc mockMvc;

	@Test
	public void findAllTest() throws Exception {

		Doctor doctor = new Doctor(1, "sai", "kumar", "vamshi", "kalyan", "murali", "santhosh", null , null, null, null);

		List<Doctor> doctors = Arrays.asList(doctor);

		Mockito.when(doctorServiceImpl.findAll()).thenReturn(doctors);

		mockMvc.perform(get("/findAll")).andExpect(status().isOk())
				.andExpect((ResultMatcher) jsonPath("$", Matchers.hasSize(1)))
				.andExpect(jsonPath("$[1].firstName", Matchers.is("sai")));

	}

}
