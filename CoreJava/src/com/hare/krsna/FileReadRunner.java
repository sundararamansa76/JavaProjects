package com.hare.krsna;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		
		Path currFile = Paths.get("./resources/data.txt");
//		List<String> lines = Files.readAllLines(currFile);
//		System.out.println(lines);
		
		Files.lines(currFile)
		.map(String::toLowerCase)
		.forEach(line -> System.out.println(line));
		
	}

}
