package com.createiq.streams;

import java.util.ArrayList;
import java.util.List;

public class Stringex {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("manu");
		list.add("manoj");
		list.add("babu");
		list.add("bala");
		list.add("siva");
		list.add("mohan");
//		System.out.println(list);
//	List<String> update=new ArrayList<>();
//	for (String string : list) {
//		if(string.startsWith("m")) {
//			update.add(string);
//		}
//	}
//	System.out.println(update);
	// java 8features
		list.stream().filter(ele->ele.startsWith("b")).forEach(System.out::println);
	   //upper case with filter
		list.stream().filter(ele->ele.startsWith("b")).map(String::toUpperCase).forEach(System.out::println);
	}

}
