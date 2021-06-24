package com.lata.capdemos.collections;

public class Student 
{
	private int stuId;
	private String stuName;
	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	public int getStuId() {
		return stuId;
	}
	public String getStuName() {
		return stuName;
	}
	
}
