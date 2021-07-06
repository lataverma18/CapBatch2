package com.lata.jpalayereddemo.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
@NamedQueries(value = 
{ 
		@NamedQuery(name="getAllEmployees", query="select employees from Employee employees")
})
public class Employee {
	@Id
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
}
