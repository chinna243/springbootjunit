package com.createiq.predicate.java8;

import java.util.function.BiPredicate;

public class BiPredicateEx {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate=(num1,num2)->num1==num2;
		System.out.println(biPredicate.test(13,13));
	}

}
