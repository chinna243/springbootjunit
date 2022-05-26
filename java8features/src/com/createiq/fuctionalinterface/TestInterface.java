package com.createiq.fuctionalinterface;

public interface TestInterface {
	default void hello() {
		System.out.println("Test");
	}

}
