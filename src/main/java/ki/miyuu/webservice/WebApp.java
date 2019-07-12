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
		rt.add(new Rating("Операционные системы", 5));
		rt.add(new Rating("Вычислительная математика", 4));
		rt.add(new Rating("ЭВМ и ПУ", 5));
		rt.add(new Rating("Схемотехника", 4));
		return rt;
	}
	
}
