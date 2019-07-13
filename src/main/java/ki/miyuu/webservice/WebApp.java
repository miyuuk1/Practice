package ki.miyuu.webservice;

import java.util.ArrayList;

// Импортируем необходимые библиотеки
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


// Определяем путь по которому будет доступен сервис
@Path("/ratings")
public class WebApp {

	@GET
	@Path("/ilyaionow")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Rating> getRatings() {
		ArrayList<Rating> rt = new ArrayList<Rating>();
		rt.add(new Rating("Operating Systems", 5));
		rt.add(new Rating("Computing", 4));
		rt.add(new Rating("Computer Architecture", 5));
		rt.add(new Rating("Electronics", 4));
		return rt;
	}
	
}
