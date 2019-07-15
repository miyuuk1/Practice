package ki.miyuu.webservice;

import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/ratings")
public class WebApp {
	
	UserRating rating = new UserRating();
	
	@POST
	@Path("/form")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Rating> getRatings(@FormParam("name") String name) {
		return rating.getUserRating(name); 
	}
		
}
