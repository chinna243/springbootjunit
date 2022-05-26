package com.createiq.java8.functioninterface;

public class Test {
   public static void main(String[] args) {
//	TestFi t=()->System.out.println("hello");
//	t.saysomting();

//	 Saysomthing saysomthing=new Saysomthing();
//	 
//	 TestFi t=() -> saysomthing.hello();
//   t.saysomting();
   
   TestFi t= Saysomthing::welcome;
   t.saysomting();
   
   
   }
}
