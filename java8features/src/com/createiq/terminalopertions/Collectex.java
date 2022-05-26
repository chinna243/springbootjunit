package com.createiq.terminalopertions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectex {
	public static void main(String[] args) {
		List<String>liststring=new ArrayList();
		liststring.add("one");
		liststring.add("two");
		liststring.add("three");
		liststring.add("four");
		liststring.add("five");
		
		Stream<String>streams=liststring.stream();
		List<String>list2=streams.map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(list2);
		
		
	}

}
