package com.createiq.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinctex {
	public static void main(String[] args) {
		List<String>stringlist=new ArrayList<>();
		
		stringlist.add("one");
		stringlist.add("two");
		stringlist.add("one");
		stringlist.add("three");
		
		Stream<String>stream=stringlist.stream();
		
		List<String>distinct=stream.distinct().collect(Collectors.toList());
		
		System.out.println(distinct);
	} 

}
