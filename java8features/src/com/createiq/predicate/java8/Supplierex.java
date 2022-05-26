package com.createiq.predicate.java8;

import java.util.function.Supplier;

public class Supplierex {
	public static void main(String[] args) {
		Supplier<String> otpsu=()->{
			String otp="";
			for(int i=1;i<=4;i++) {
				
				otp=otp+((int)(Math.random()*10));
			}
			return otp;
			
		};
		System.out.println(otpsu.get());
		System.out.println(otpsu.get());
		System.out.println(otpsu.get());
	}

}
