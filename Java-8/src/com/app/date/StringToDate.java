package com.app.date;

import java.time.LocalDate;

public class StringToDate {

	public static void main(String[] args) {

		String s="1996-11-14";
		
		LocalDate d=LocalDate.parse(s);
		System.out.println("Date :" +d);
	}

}
