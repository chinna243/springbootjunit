package com.createiq.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("rma");
		list.add("ragu");
		list.add("radha");
		list.add("rani");
		list.add("sri");
		list.add("sai");
		list.add("somu");
		list.add("sam");
		List<String> up=new ArrayList<>(list);
		for (String string : up) {
			System.out.println(string);
			
		}
List<String>update=list.stream().filter(ele->ele.startsWith("r")).collect(Collectors.toList());
		System.out.println(update);
	}

}
