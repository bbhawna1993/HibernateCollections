package com.io.hibernatemaven;
import javax.persistence.Embeddable;

//It will be embeddable
//adding change for embeddable
@Embeddable
public class Address {

	private String city;
	private String street;
	private String state;
	private String pincode;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


}
