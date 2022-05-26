package com.createiq.streams;


import java.util.ArrayList;
import java.util.List;

public class NeedoFStreams {
	public static void main(String[] args) {
	List<String> list=new ArrayList<String>();	
	list.add("mohan");
	list.add("murali");
	list.add("ragu");
	list.add("siva");
	list.add("ragu");
	list.add("sai");
	System.out.println(list);
	
	List<String>upperlist=new ArrayList<>();
	for (String string : list) {
		upperlist.add(string.toUpperCase());
	}
	System.out.println(upperlist);
	System.out.println("affter JAVA");
	
	list.stream().map(string->string.toUpperCase()).forEach(System.out::println);
	System.out.println("lowercase");
	list.stream().map(string->string.toLowerCase()).forEach(System.out::println);
	}

}
