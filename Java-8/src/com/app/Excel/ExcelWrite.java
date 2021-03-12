package com.app.Excel;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExcelWrite {

	public static void main(String[] args) {

		/*Path filePath=Paths.get(System.getProperty("user.dir"),"f://Employee.xlsx");
		
		try {
			BufferedWriter bf=Files.newBufferedWriter(filePath);
			bf.write("Hello world");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Path path = Paths.get("Name.txt");

		try (Stream<String> lines = Files.lines(path)) {
			lines.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
