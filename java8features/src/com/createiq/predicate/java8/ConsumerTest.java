package com.createiq.predicate.java8;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> printstriength=(str)-> System.out.println(str+"length"+str.length());
		printstriength.accept("murali");
		printstriength.accept("murali is softwareDeveloper");
		
		
		Consumer<Integer> sumsqr=(num)->System.out.println(num+"sq: "+(num*num));
		sumsqr.accept(20);
		sumsqr.accept(20);
	}

}
