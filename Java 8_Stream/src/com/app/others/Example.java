package com.app.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {

		Stream.of("First", "Second", "Second", "Third", "Fourth").limit(3).distinct().forEach(System.out::println);
	
		List<String> names = new ArrayList();

		names.add("Vrushali");
		names.add("Snehal");
		names.add("Molshree");
		names.add("Ankita");
		names.add("Indar");
		names.add("Arti");
		names.add("kajol");
		names.add("Deepali");
		
		Object[] streamArray=names.stream().limit(3).toArray();
		System.out.println(Arrays.toString(streamArray));
		
		names.stream().filter((name) -> name.length()>5)
		     .peek(s -> System.out.println("filtered name :" +s))
		         .map(String::toUpperCase)
		             .peek(s -> System.out.println("Mapped name :" +s))
		                  .toArray();
	}

}
