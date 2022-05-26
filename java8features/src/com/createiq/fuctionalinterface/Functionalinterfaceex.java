package com.createiq.fuctionalinterface;



public class Functionalinterfaceex implements Sayable{

	@Override
	public void say(String msg) {
		
		System.out.println(msg);
	}
		public static void main(String args []) {
			
		Functionalinterfaceex e=new Functionalinterfaceex();
		e.say("hello");
	}

}
