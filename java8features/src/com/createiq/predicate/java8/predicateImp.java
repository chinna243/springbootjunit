package com.createiq.predicate.java8;

import java.util.function.Predicate;

public class predicateImp implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if(t%2==0) {
			return true;
		}
		return false;
	}

}
