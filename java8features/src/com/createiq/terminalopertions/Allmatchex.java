package com.createiq.terminalopertions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Allmatchex {
	public static void main(String[] args) {
		List<String>liststring=new ArrayList<String>();
		
		liststring.add("java guidies");
		liststring.add("python guidies");
		liststring.add("c guidies");
		
		Stream<String> streamlist=liststring.stream();
		
		boolean allmatch=streamlist.allMatch((value)->{return value.contains("guidies");});
		System.out.println(allmatch);
		
	}

}
