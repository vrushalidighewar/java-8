package com.app.FI;

public interface FI {

	public void methodOne();
	
	default void methodTwo() {
		System.out.println("Two");
	}
	
	static void methodThree() {
		System.out.println("Three");
	}
}
