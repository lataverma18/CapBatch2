package com.lata.capdemos.inheritance;
class A
{}
class B extends A{}
public class Employee {
	private int employeeId;
	private String employeeName;
	int i=10;
	//Covariant return type
	public A get()
	{
		System.out.println("get of Employee");
		return null;
	}
	public void get(int i)
	{
		
	}
	
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
