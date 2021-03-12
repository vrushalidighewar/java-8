package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceTest {

	public static void main(String[] args) {

		List<String> names=new ArrayList();
		
		names.add("Vrushali");
		names.add("Snehal");
		names.add("Molshree");
		names.add("Ankita");
		names.add("Indar");
		names.add("Arti");
		
		Optional<String> s=names.stream().reduce((s1,s2) -> s1 +"-"+ s2);
		
		if(s.isPresent()) {
			System.out.println(s);
		}

	}

}
