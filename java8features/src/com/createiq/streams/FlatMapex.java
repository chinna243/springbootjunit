package com.createiq.streams;

import java.util.ArrayList;
import java.util.List;

public class FlatMapex {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("manu");
		list.add("manoj");
		list.add("babu");
		list.add("bala");
		list.add("banu");
		list.add("mohan");
		list.stream().filter(ele->ele.startsWith("b")).map(String::toUpperCase).distinct().forEach(System.out::println);
		System.out.println("sorted");
		
		list.stream().filter(ele->ele.startsWith("b")).map(String::toUpperCase).sorted().forEach(System.out::println);
	

	
	
	}

}
