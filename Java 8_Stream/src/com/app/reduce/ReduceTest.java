package com.app.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceTest {

	public static void main(String[] args) {

		Stream<Integer> streamofno=Stream.of(1,3,5,7,9,1);
		System.out.println(streamofno.count());
		
		//method performs reduction operation on elements of a stream using initial value and binary operation.
		OptionalInt sum=Arrays.stream(new int[] {1,3,5,7,9}).reduce((a,b) -> a+b);
		System.out.println(sum);
		
		OptionalInt min=Arrays.stream(new int[] {3,5,7,2,1}).min();
		System.out.println(min);
		
		OptionalInt max=Arrays.stream(new int[] {5,2,9,4,3}).max();
		System.out.println(max);
		

		List<String> names = new ArrayList();
		names.add("Vrushali");
		names.add("Rutuja");
		names.add("Leela");
		names.add("Prabhakar");
		names.add("Chotu");
		names.add("Sakhu");
		names.add("Chandu");
		names.add("Molshree");
		names.add("Kajol");
		
		long name=names.stream().filter((s) -> s.length()>5).count();
		System.out.println(name);
		
		List<String> firstnames=names.stream().limit(3).collect(Collectors.toList());
		System.out.println(firstnames);
	}

}
