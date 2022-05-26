package com.createiq.terminalopertions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Countex {
	public static void main(String[] args) {
		
		List<String>liststring=new ArrayList();
		liststring.add("one");
		liststring.add("two");
		liststring.add("three");
		liststring.add("four");
		liststring.add("five");
		Stream<String>streamlist=liststring.stream();
		long count=streamlist
				.map(ele->ele.toUpperCase()).count();
		System.out.println(count);
	}

}
