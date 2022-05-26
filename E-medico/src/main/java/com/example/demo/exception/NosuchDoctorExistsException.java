package com.example.demo.exception;

public class NosuchDoctorExistsException extends RuntimeException {
	
	
	public String message;

	public NosuchDoctorExistsException() {
		super();
	}

	public NosuchDoctorExistsException(String message) {
		super(message);
		this.message = message;
	}
	
	
	

}
