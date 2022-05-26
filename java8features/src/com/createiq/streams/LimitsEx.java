package com.createiq.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LimitsEx {
	public static void main(String[] args) {
		List<String>stringlimits=new ArrayList<>();
		stringlimits.add("one");
		stringlimits.add("two");
		stringlimits.add("one");
		stringlimits.add("three");
		Stream<String>streamlimt=stringlimits.stream();
		streamlimt.limit(3)
		.forEach(ele->{System.out.println(ele);});
		
	}

}
