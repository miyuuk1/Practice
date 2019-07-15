package ki.miyuu.webservice;

import java.util.ArrayList;

// Импортируем необходимые библиотеки
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


// Определяем путь по которому будет доступен сервис
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
