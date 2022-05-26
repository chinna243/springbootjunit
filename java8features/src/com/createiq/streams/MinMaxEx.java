package com.createiq.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MinMaxEx {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(13);
		list.add(42);
		list.add(22);
		list.add(420);
		list.add(52);
		list.add(45);
		list.add(7); 
		list.add(2);
		list.add(32);
		list.add(27);
		list.add(40);
		
		//List<Integer> m=new  ArrayList<>();
		
			
//		Iterator< Integer>n=list.iterator();
//		while (n.hasNext()) {
//		System.out.println(n.next());
//			
//		}
		//list.stream().map(ele->ele.MAX_VALUE).forEach(System.out::println);
		
	Integer integer=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(integer);
	Integer integer2=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(integer2);
	}

}
