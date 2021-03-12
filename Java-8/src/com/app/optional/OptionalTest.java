package com.app.optional;

import java.util.Optional;

public class OptionalTest {

	public Optional<String> concatStrings() {

		Optional<String> first = Optional.of("123");
		Optional<String> second = Optional.of("456");
		return first;
	}

	public static void main(String[] args) {
		OptionalTest test = new OptionalTest();
		Optional<String> result = test.concatStrings();
		System.out.println(result.get());
	}
 
	
}
