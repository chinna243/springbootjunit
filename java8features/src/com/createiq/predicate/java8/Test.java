package com.createiq.predicate.java8;

import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		
	
//	Predicate<Integer>predicate=new predicateImp();
//	System.out.println(predicate.test(11));
//		Predicate<Integer>predicate=(t)->t%2==0;
//		System.out.println(predicate.test(11));
		 
		
		Predicate<Integer> singledigit=(t)->t<10&& t>-10;
		System.out.println(singledigit.test(2));
		System.out.println(singledigit.test(-2));
		System.out.println(singledigit.test(22));
		System.out.println(singledigit.test(51));
	}
}
