package com.day8.assignment.Question4;

import java.io.Serializable;

public class Address implements Serializable{

	String state;
	String city;
	int pincode;
	
	
	public Address() {
		super();
	}


	public Address(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	
	
}
