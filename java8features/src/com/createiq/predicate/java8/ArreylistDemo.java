package com.createiq.predicate.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArreylistDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,1,2,3,5,6,56,22);
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
//	Collections.reverse(list);
//	System.out.println(list);
//	
//	Comparator<Integer> comparator=(t1,t2)->
	Collections.sort(list,(t1,t2)->t2-t1);
	System.out.println(list);
	
	
	}

}
