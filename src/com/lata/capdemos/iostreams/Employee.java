package com.lata.capdemos.iostreams;

import java.io.Serializable;

public class Employee implements Serializable {
private int employeeId;
private String employeeName;
public Employee(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}
}
