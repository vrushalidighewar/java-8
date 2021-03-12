package com.app.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lambda_Expression {

	public static void main(String[] args) {
 
		List<String> list=new ArrayList<String>();
		list.add("L");
		list.add("R");
		list.add("P");
		list.add("V");
		list.add("S");
		
		Stream<String> stream=list.stream();
		stream.forEach(System.out::println);
		
		//System.out.println(stream.count());
		System.out.println("__________________________________");
		
		for(String string : list) {System.out.println(string);}
		
		System.out.println("__________________________________");

		list.forEach(s->{if(s.contains("V")) System.out.println(s);});
	}

}
