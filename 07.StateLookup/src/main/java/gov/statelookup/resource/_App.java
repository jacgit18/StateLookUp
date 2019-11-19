package gov.statelookup.resource;

import static spark.Spark.get;

import gov.statelookup.controller.AuthorController;
import gov.statelookup.controller.StateLookupController;

public class _App {

	public static void main(String[] args) {

	    get("/author", ( req, res ) -> "Joshua Carpentier" );
	    get("/author/details",AuthorController::getInfo);
	    get("/statelookup/:code",StateLookupController::getStateInfo);

	    
	}

}
