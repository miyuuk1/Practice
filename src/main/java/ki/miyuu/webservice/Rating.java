package ki.miyuu.webservice;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rating")
public class Rating implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String subject;
	private int rate;
	private int id;
	private int nextId = 0;
	
	public Rating() {};
	public Rating(String n, int r) {
		subject = n;
		rate = r;
		id = nextId;
		nextId++;
	}
	@XmlElement
	public String getSubject() {
		return subject;
	}
	
	@XmlElement
	public int getRate() {
		return rate;
	}

	
	public void setRate(int r) {
		rate = r;
	}
	
	public int getId() {
		return id;
	}
	
	public String getInfo() {
		return subject + " " + rate;
	}
}
