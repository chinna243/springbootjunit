package com.createiq.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peekex {
	public static void main(String[] args) {
		Stream.of("one","two","three","four")
		.filter(e->e.length()>3)
		
		.peek(e->System.out.println("filtered values:"+e))
		.map(String::toUpperCase)
		.peek(e->System.out.println("map values:"+e))
		.collect(Collectors.toList());
	}

}
