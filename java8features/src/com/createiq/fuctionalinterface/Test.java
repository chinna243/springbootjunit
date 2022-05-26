package com.createiq.fuctionalinterface;

public class Test {
	public static void main(String[] args) {
//		DemointerfaceImp demo=new DemointerfaceImp();
//		demo.hi();
//		demo.hello();
//		Demointerface.welcome();
	
	FunctionalDemo demo=new FunctionalDemo() {
		public void hi() {
			System.out.println("hi....");
		}
	};
	
	demo.hi();
	
	}

}
