package gov.statelookup.driver;

import gov.statelookup.dao.StateLookupDAO;

public class Driver {

	public static void main(String[] args) {

		
		StateLookupDAO dao = new StateLookupDAO();
		String name = dao.findByKey("NY");
		System.out.println(name);
		System.out.println("------------------------");
		name = dao.findByKey("CT");
		System.out.println(name);

		System.out.println("------------------------");
		name = dao.findByKey("NJ");
		System.out.println(name);

	}

}
