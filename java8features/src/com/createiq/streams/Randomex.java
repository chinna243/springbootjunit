package com.createiq.streams;

import java.util.Random;
import java.util.stream.Stream;

public class Randomex {
	public static void main(String[] args) {
	Random random=new Random();
	Stream<Integer> nums=Stream.generate(()->random.nextInt(100)).limit(5);
	nums.forEach(System.out::println);
	}

}
