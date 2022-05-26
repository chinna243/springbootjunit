package com.createiq.terminalopertions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NonMatch {
	public static void main(String[] args) {
		List<String> liststring=new ArrayList();
		liststring.add("mohan");
		liststring.add("murali");
		
		Stream<String>streamlist=liststring.stream();
		boolean nonmatch=streamlist.noneMatch((value)->{return "murali".equals(value);});
		System.out.println(nonmatch);
		}
		
		
		
	}


