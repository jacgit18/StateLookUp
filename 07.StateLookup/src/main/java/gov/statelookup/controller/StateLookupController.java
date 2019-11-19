package gov.statelookup.controller;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import gov.statelookup.dao.StateLookupDAO;
import spark.Request;
import spark.Response;

public class StateLookupController {

	static Gson gson = new Gson();

	
	public static Object getStateInfo( Request req, Response res ) {
    	
    	res.type("application/json");
    	
    	Map<String, String> map = new HashMap<>();
    	StateLookupDAO dao = new StateLookupDAO();
    	String code = req.params("code");
    	String name = dao.findByKey(code);
    	
    	map.put(code, name);
    	
    	String json = gson.toJson(map);
    	
    	return json;
    	
    	
    };
	
	
	
}
