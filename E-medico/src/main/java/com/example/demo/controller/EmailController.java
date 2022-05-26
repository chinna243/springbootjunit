package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.EmailSender;

@RestController
public class EmailController {

	
	@Autowired
	private EmailSender  emailSender;
	@GetMapping("/semdEmail")
	public String sendEmail() {
		return emailSender.sendSimpleMail("noreply@createiq.com", "saichinna243@gmail.com", "hi this is sai", "hi iam sending mail through java");
	}
	
}
