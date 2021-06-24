package com.lata.capdemos.beans;

import com.lata.capdemos.enums.Department;

public class Employee {
	
	private String employeeName;
	private int employeeId;
	private Department employeeDept;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Department getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(Department employeeDept) {
		this.employeeDept = employeeDept;
	}

}
