package com.lata.capdemos.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get("File2.txt");
		List<String> lines = Files.readAllLines(file);
		for(String line:lines) {
			System.out.println(line);
		}
		System.out.println("End of File....");
	}
}
