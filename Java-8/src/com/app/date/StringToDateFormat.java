package com.app.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDateFormat {

	public static void main(String[] args) {

		String s="1996-11-14";
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-M-dd");
		LocalDate d=LocalDate.parse(s,df);
		System.out.println("Date :" +d);
	}

}
