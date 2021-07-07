package com.lata.springdemo.beans;

public class Address {
private String address;
private String city;
private String state;
private int zipcode;
public Address(String address, String city, String state, int zipcode) {
	super();
	this.address = address;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return "Address [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
}

}
