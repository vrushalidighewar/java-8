package com.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 15; i++) {
			list.add(i);
		}
		System.out.println(list);

		for (Integer integer : list) {
			if (integer % 2 == 0)
				System.out.println(integer);
		}
		System.out.println("______________________________________________");

		// list.stream().filter((i) -> i%2==0).forEach(System.out::println);
		list.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("______________________________________________");

		Stream<Integer> stream=Stream.of(1,3,5,7,9,1);
		
		//stream.distinct().forEach(System.out::println);
		
		//System.out.println(stream.count());
		
		Boolean result=stream.filter((i) -> i%2==1).findFirst().isPresent();
		System.out.println(result);

		System.out.println("______________________________________________");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("V", 5);
		map.put("R", 21);
		map.put("U", 55);
		map.put("S", 9);
		map.put("H", 78);
		
		Set<String> set=map.keySet();
		set.stream().sorted().forEach(System.out::println);
	}

}
