package ki.miyuu.webservice;

import java.util.ArrayList;

public class UserRating {
	
	private ArrayList<User> userList;
	
	public UserRating() {
		userList = new ArrayList<User>();
		int[] rates =  {5, 4, 5, 4};
		userList.add(new User("ionow", rates));
	}
	
	public ArrayList<Rating> getUserRating(String name) {
		for (User u : userList) {
			if (u.getName().contentEquals(name)) {
				return u.getRating();
			}
		}
		int[] defRate = { 0, 0, 0, 0 };
		User nu = addUser(name, defRate);
		return nu.getRating();
	}
	
	public User addUser(String name, int[] rates) {
		User u = new User(name, rates);
		userList.add(u);
		return u;
	}
	
	
}
