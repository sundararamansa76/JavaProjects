package com.hare.krsna;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		
		Path currFile = Paths.get("./resources/writehere.txt");
//		List<String> lines = Files.readAllLines(currFile);
//		System.out.println(lines);
		
		List<String> list = List.of("Krsna","Radhe", "Rama", "Balarama");
		
		Files.write(currFile, list);
		
	}

}
