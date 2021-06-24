package com.lata.capdemos.streams;

public class Employee 
	{
		private int employeeId;
		private String employeeName;
		private int employeeSalary;
		private String employeeDept;
		
		public Employee(int employeeId, String employeeName, int employeeSalary, String employeeDept) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
			this.employeeDept = employeeDept;
		}
		
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + ", employeeDept=" + employeeDept + "]";
		}

		public int getEmployeeId() {
			return employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public int getEmployeeSalary() {
			return employeeSalary;
		}

		public String getEmployeeDept() {
			return employeeDept;
		}
		
		
	}



