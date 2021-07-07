package com.lata.springdemo.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("add1")
@PropertySource("application.properties")
public class Address {
private String address;
private String city;
private String state;
private int zipcode;

public String getAddress() {
	return address;
}
@Value("${address}")
public void setAddress(String address) {
	this.address = address;
}


public String getCity() {
	return city;
}

@Value("${city}")
public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}

@Value("${state}")
public void setState(String state) {
	this.state = state;
}


public int getZipcode() {
	return zipcode;
}

@Value("${zipcode}")
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}


public Address() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Address [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
}

}
