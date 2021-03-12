package com.app.findandmatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Finding_Matching_Operation {

	public static void main(String[] args) {

		List<String> names = new ArrayList();

		names.add("Vrushali");
		names.add("Snehal");
		names.add("Molshree");
		names.add("Ankita");
		names.add("Indar");
		names.add("Arti");
		names.add("kajol");
		names.add("Deepali");
		
		if(names.stream().anyMatch((s) -> s.length()==8)) {
			System.out.println("Present");
		}
		
		if(names.stream().allMatch((s) -> s.length() > 3)){
			System.out.println("All are big names");
		}
		
		if(names.stream().noneMatch((s) -> s.length()==2)) {
			System.out.println("no such name present");
		}

		Optional<String> firstelement=Stream.of("1","2","3","4").findFirst();
		System.out.println(firstelement);
		
		Optional<String> anyelement=Stream.of("9","2","3","4","5").findAny();
		System.out.println(anyelement);
	}

}
