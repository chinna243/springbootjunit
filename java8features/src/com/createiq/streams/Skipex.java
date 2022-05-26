package com.createiq.streams;

import java.util.ArrayList;
import java.util.List;

public class Skipex {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("manu");
		list.add("manoj");
		list.add("babu");
		list.add("bala");
		list.add("banu");
		list.add("mounika");
		list.add("moulali");
		list.add("madhu");
		list.add("mani");
		list.add("muni");
	//	list.stream().filter(s->s.startsWith("m")).map(String::toUpperCase).limit(3).forEach(System.out::println);
		System.out.println("foreachorder");
		//list.stream().filter(s->s.startsWith("m")).map(String::toUpperCase).limit(6).forEachOrdered(System.out::println);
		System.out.println("skip .....");
		list.stream().filter(s->s.startsWith("m")).map(String::toUpperCase).skip(3).forEachOrdered(System.out::println);
	
	}

}
