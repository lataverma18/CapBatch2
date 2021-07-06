package com.lata.jpalayereddemo.dto;

import java.time.LocalDate;

public class EmployeeDto {
	private int empid;
	private String empname;
	private int empsalary;
	private LocalDate empdoj;
	private String empdept;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public LocalDate getEmpdoj() {
		return empdoj;
	}
	public void setEmpdoj(LocalDate empdoj) {
		this.empdoj = empdoj;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	@Override
	public String toString() {
		return "EmployeeDto [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empdoj="
				+ empdoj + ", empdept=" + empdept + "]";
	}

}
