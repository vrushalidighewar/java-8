package com.app.FI;

public class FITest implements FI {

	@Override
	public void methodOne() {
		System.out.println("One");
	}
	
	public static void add() {
		
	}

	public static void main(String[] args) {

		FI t = new FITest();
		t.methodOne();
		t.methodTwo();
		// t.methodThree();
		
		FITest i=new FITest();
            i.methodOne();
            add();
            i.add();
	}

}
