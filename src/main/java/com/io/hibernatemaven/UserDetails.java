package com.io.hibernatemaven;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDetails {

	@Id @GeneratedValue
	private int userId;
	private String userName;

	@ElementCollection
	private List<Address> userAddress=new ArrayList<Address>();

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Address> getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(List<Address> userAddress) {
		this.userAddress = userAddress;
	}
}
