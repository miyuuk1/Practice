package ki.miyuu.webservice;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.sun.research.ws.wadl.Request;

import javax.ws.rs.Produces;

@Path("/service")
public class WebApp {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	// CRUD
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Rating> getRating() {
		List<Rating> ratings = new ArrayList<Rating>();
		ratings.addAll(UserRating.instance.getContent().values());
		return ratings;
	}
	
	@Path("{ratingId}")
    public RatingResource getTodo(@PathParam("ratingId") String id) {
        return new RatingResource(uriInfo, request, id);
    }
}