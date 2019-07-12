package ki.miyuu.webservice;

import javax.ws.rs.*;

@Path("/hello")
public class WebApp {

	@GET
	public String sayHello() {
		return "Hello world!";
	}
	
}
