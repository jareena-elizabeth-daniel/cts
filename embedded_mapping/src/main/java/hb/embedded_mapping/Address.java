package hb.embedded_mapping;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String city;
	private String state;
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
