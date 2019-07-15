package ki.miyuu.webservice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rating {	

	private String subject;
	private String rating;
	private String id;
	
	public Rating() {
		
	}
	
	public Rating(String s, String id) {
		subject = s;
		this.id = id;
	}
	
	public void setSubject(String s) {
		subject = s;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setRating(String r) {
		rating = r;
	}
	
	public String getRating() {
		return rating;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
}
