package com.createiq.predicate.java8;

public class ThreadDemo  implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
			
		}
		
	}
	
	public static void main(String[] args) {
		ThreadDemo t=new ThreadDemo();
		Thread t1=new Thread(t);
		t1.start();
	}

}
