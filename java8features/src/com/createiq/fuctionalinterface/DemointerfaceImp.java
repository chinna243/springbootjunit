package com.createiq.fuctionalinterface;

public class DemointerfaceImp implements Demointerface,TestInterface {

	

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		TestInterface.super.hello();
	}
 
}
