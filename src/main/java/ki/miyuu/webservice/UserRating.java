package ki.miyuu.webservice;

import java.util.Map;
import java.util.HashMap;

public enum UserRating {
	instance;
	private Map<String, Rating> content = new HashMap<>();
	
	private UserRating() {
		
		Rating rating = new Rating("Computer Architecture", "1");
		rating.setRating("5");
		
		content.put("1", rating);
		
		rating = new Rating("Computational Mathematics", "2");
		rating.setRating("4");
		
		content.put("2", rating);
		
		rating = new Rating("Electronics", "3");
		rating.setRating("4");
		
		content.put("3", rating);
		
		rating = new Rating("Operating Systems", "4");
		rating.setRating("5");
		
		content.put("4", rating);
		
	}
	
	public Map<String, Rating> getContent() {
		return content;
	}
}