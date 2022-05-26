package com.createiq.terminalopertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Findany {
	public static void main(String[] args) {
		List<String>liststring=new ArrayList();
		liststring.add("one");
		liststring.add("two");
		liststring.add("three");
		liststring.add("four");
		liststring.add("one");
//		Stream<String>streamlist=liststring.stream();
//		Optional<String>anyelement=streamlist.findAny();
//		System.out.println(anyelement.get());
	
	Stream<String>stream=liststring.stream();
	Optional<String>findfist=stream.findFirst();
	System.out.println(findfist.get());
	
	}

}
