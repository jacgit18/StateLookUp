package gov.statelookup.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class StateLookupDAO {

	public String findByKey(String code) {
		
		 File f = getFileFromResources("state-lookup.csv");
		 	if (mapstate.size() == 0) 
	        loadHashMap(f);

		return mapstate.get(code);
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

	
	private static Map<String, String> mapstate = new HashMap<>();
	
	private static void loadHashMap(File file) {

		if (file == null)
			return;

		try (FileReader reader = new FileReader(file); BufferedReader br = new BufferedReader(reader)) {

			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				String columns[] = line.split(",");
				mapstate.put(columns[1], columns[2]);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	

}