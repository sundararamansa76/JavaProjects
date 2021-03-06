package com.hare.krsna;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanner {

	public static void main(String[] args) {

		try {
			Path dir = Paths.get(".");
			Predicate<? super Path> predicate = path -> String.valueOf(path).contains("java");
			// Files.list(dir).forEach(ele -> System.out.println(ele));
			Files.walk(dir, 7).filter(predicate).forEach(ele -> System.out.println(ele));

			BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path)
					.contains("Java");
			Files.find(dir, 7, matcher);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
