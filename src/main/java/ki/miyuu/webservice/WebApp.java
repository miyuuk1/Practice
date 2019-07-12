package ki.miyuu.webservice;

import java.util.ArrayList;

// ����������� ����������� ����������
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


// ���������� ���� �� �������� ����� �������� ������
@Path("/ratings")
public class WebApp {

	@GET
	@Path("/ilyaionow")
	@Produces(MediaType.APPLICATION_XML)
	public ArrayList<Rating> getRatings() {
		ArrayList<Rating> rt = new ArrayList<Rating>();
		rt.add(new Rating("������������ �������", 5));
		rt.add(new Rating("�������������� ����������", 4));
		rt.add(new Rating("��� � ��", 5));
		rt.add(new Rating("������������", 4));
		return rt;
	}
	
}
