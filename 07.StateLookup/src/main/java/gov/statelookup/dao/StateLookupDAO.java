package gov.statelookup.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class StateLookupDAO {

	public String findByKey(String code) {
		
		 File f = getFileFromResources("state-lookup.csv");

	        printFile(f);

		return "Not Found";
	}

// get file from classpath, resources folder
	private File getFileFromResources(String fileName) {

		ClassLoader classLoader = getClass().getClassLoader();

		URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file is not found!");
		} else {
			return new File(resource.getFile());
		}

	}

	private static void printFile(File file) {

		if (file == null)
			return;

		try (FileReader reader = new FileReader(file); BufferedReader br = new BufferedReader(reader)) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	

}