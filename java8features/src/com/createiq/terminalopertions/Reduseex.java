package com.createiq.terminalopertions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduseex {
	public static void main(String[] args) {
		List<String>liststring=new ArrayList();
		liststring.add("one");
		liststring.add("two");
		liststring.add("three");
		liststring.add("four");
		liststring.add("one");
		Stream<String>list=liststring.stream();
		
		Optional<String> reduse=list.reduce((valu,Combinedvalue)->{return Combinedvalue+" "+valu;});
	

    System.out.println(reduse);
}
	}