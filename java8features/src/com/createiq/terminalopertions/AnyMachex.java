package com.createiq.terminalopertions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AnyMachex {
	public static void main(String[] args) {
	List<String>liststring=new ArrayList<>();
	liststring.add("java guadies");
	liststring.add("python guadies");
	liststring.add("c guadies");
	Stream<String>liststream=liststring.stream();
boolean anyMach=liststream.anyMatch((value)->{return value.startsWith("java");});
System.out.println(anyMach); 
	
	}

}
