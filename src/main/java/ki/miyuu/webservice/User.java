package ki.miyuu.webservice;

import java.util.ArrayList;

public class User {

	private String name;
	private ArrayList<Rating> rating;
	
	public User(String n, int[] rate) {
		name = n;
		rating = new ArrayList<Rating>();
		rating.add(new Rating("Operating Systems", rate[0]));
		rating.add(new Rating("Computing", rate[1]));
		rating.add(new Rating("Computer Architecture", rate[2]));
		rating.add(new Rating("Electronics", rate[3]));
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Rating> getRating() {
		return rating;
	}
	
}
