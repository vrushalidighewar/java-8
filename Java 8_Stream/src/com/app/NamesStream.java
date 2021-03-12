package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NamesStream {

	public static void main(String[] args) {

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
		
		names.stream().sorted().forEach(System.out::println);

		System.out.println("________________________________________________");
		
		names.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("________________________________________________");
		
		names.stream().limit(5).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("________________________________________________");
		
		names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);
		
		System.out.println("________________________________________________");

		names.stream().skip(5).forEach(System.out::println);  //skipping first 5 names
		
		System.out.println("________________________________________________");

		names.stream().map(String::length).forEach(System.out::println);
		
		System.out.println("________________________________________________");
		
		names.stream().sorted((s1,s2) -> s1.length()- s2.length()).forEach(System.out::println);
	}

}
