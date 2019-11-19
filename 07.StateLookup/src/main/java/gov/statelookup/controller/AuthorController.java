package gov.statelookup.controller;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import spark.Request;
import spark.Response;

public class AuthorController {

	static Gson gson = new Gson();

	
	public static Object getInfo( Request req, Response res ) {
    	
    	res.type("application/json");
    	
    	Map<String, String> map = new HashMap<>();
    	map.put("author", "Joshua Carpentier");
    	map.put("email", "Joshcarp18@gmail.com");
    	map.put("title", "Software Engineer");
    	String json = gson.toJson(map);
    	
    	return json;
    	
    	
    };
	
	
	
}
