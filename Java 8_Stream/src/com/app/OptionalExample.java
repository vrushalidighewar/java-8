package com.app;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		String name=null;
		
		Optional<String> os=Optional.ofNullable(name);
		
		System.out.println(os.isPresent());
		
		System.out.println(os.of("abc").toString());

	}

}
