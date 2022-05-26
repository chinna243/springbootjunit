package com.createiq.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap {
	public static void main(String[] args) {
		List<Integer> even=Arrays.asList(2,4,6,8,10,12);
		List<Integer>odd=Arrays.asList(1,3,5,7,9,11,13);
		List<Integer>prime=Arrays.asList(2,3,5,11);
		List<Integer>numbers=Stream.of(even,odd,prime)
				.flatMap(list->list.stream())
				.collect(Collectors.toList());
		System.out.println("flatetedlist"+numbers);
		
		System.out.println("sorted....");
		List<Integer>num2=Stream.of(even,odd,prime).flatMap(ele->ele.stream())
				.sorted((a,b)->a-b)	.collect(Collectors.toList());
		System.out.println("sorted"+num2);
	}

}
