package com.example.demo.exception;

public class DoctorAlreadyException extends RuntimeException {
	
	private String message;

	public DoctorAlreadyException() {
		
	}

	public DoctorAlreadyException(String message) {
		super(message);
		this.message = message;
	}
	
	
	
	

}
