package gov.statelookup.driver;

import gov.statelookup.dao.StateLookupDAO;

public class Driver {

	public static void main(String[] args) {

		
		StateLookupDAO dao = new StateLookupDAO();
		
		String states[] = {"NY","CT","FL","NJ"};
		
		for (String state : states) {

			String name = dao.findByKey(state);
			System.out.println(name);
		}
		

	}

}
