package com.createiq.predicate.java8;

public class Demo {
	
	public static void main(String[] args) {
		Runnable r=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(i+1);
				
			}
		};
		Thread t1=new Thread(r);
		t1.start();
	}

}
