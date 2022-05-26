package com.createiq.predicate.java8;

import java.util.function.Function;

public class Functionex {
	public static void main(String[] args) {
		Function<String,Integer> strlength=(str)->str.length();
		
		Integer len=strlength.apply("murali v");
		System.out.println("length:"+len);
		Function<Integer,Integer> finsqr=(num)->num*num;
		Integer sq=finsqr.apply(10);
		System.out.println("result"+sq);
	}

}
