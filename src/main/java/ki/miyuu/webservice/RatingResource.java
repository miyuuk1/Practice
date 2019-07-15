package ki.miyuu.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import com.sun.research.ws.wadl.Request;

public class RatingResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	String id;
	
	public RatingResource(UriInfo ui, Request re, String id) {
		uriInfo = ui;
		request = re;
		this.id = id;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Rating getRating() {
		Rating rating = UserRating.instance.getContent().get(id);
		if (rating == null) {
			throw new RuntimeException("Id not found");
		}
		return rating;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response addRating(JAXBElement<Rating> rate) {
		Rating rt = rate.getValue();
		return updateRating(rt);
	}
	
	@DELETE
	public void deleteRating() {
		Rating rt = UserRating.instance.getContent().remove(id);
		if (rt == null) {
			throw new RuntimeException("Id not found");
		}
	}
	
	private Response updateRating(Rating r) {
		Response res;
		if(UserRating.instance.getContent().containsKey(r.getId())) {
            res = Response.noContent().build();
        } else {
            res = Response.created(uriInfo.getAbsolutePath()).build();
        }
        UserRating.instance.getContent().put(r.getId(), r);
        return res;
	}
	
}
