package com.lata.capdemos.inheritance;

public class Student {
private int stuId;
private String stuName;
private Address address;
public int getStuId() {
	return stuId;
}
public void setStuId(int stuId) {
	this.stuId = stuId;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Student(int stuId, String stuName, Address address) {
	super();
	this.stuId = stuId;
	this.stuName = stuName;
	this.address = address;
}

public String toString()
{
	return "Student["+stuId+","+stuName+","+address+"]";
}
}
