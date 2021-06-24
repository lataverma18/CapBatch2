package com.lata.capdemos.collections;

public class Employee implements Comparable 
{
	private String employeeName;
	private int employeeId;
	private int employeeSalary;
	public Employee(String employeeName, int employeeId, int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	@Override
	public boolean equals(Object obj)
	{
		Employee emp=(Employee)obj;  	//Backward downcasting
		if(this.employeeId==emp.employeeId && this.employeeName.equals(emp.employeeName) && this.employeeSalary==emp.employeeSalary)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode()
	{
		return employeeId;
	}
	@Override
	public int compareTo(Object o) {
		Employee emp=(Employee)o;
		return this.employeeId-emp.employeeId;
	}
}
