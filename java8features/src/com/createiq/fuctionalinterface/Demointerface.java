package com.createiq.fuctionalinterface;

public interface Demointerface {
    
	void hi();
	static  void welcome () {
		System.out.println("welcome....");
	}
	default void hello() {
		System.out.println("hello...");
	}
	
}
