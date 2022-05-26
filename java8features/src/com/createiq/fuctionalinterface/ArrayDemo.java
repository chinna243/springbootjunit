package com.createiq.fuctionalinterface;

import java.util.ArrayList;

public class ArrayDemo {
	public static void main(String[] args) {
		
	
	ArrayList<Student> l=new ArrayList();
	l.add(new Student(10, "murli", 2500.00));
	l.add(new Student(12, "mohan", 25000.00));
    l.add(new Student(13, "babu", 22000.00));
	l.add(new Student(11, "anu", 2000.00));
	System.out.println("before"+l);
//	
//	for (Student student : l) {
//		System.out.println(student);
//		
//	}
	l.forEach(System.out::println);
	
	}
}
