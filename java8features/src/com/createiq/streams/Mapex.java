package com.createiq.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapex {
	public static void main(String[] args) {
		List<String>liststring=Arrays.asList("1","2","3","4","5");
		List<Integer>streamlist=liststring.stream()
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		
				System.out.println(streamlist);
		
		
	}

}
