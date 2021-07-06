package com.lata.onetomany.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int did;
	private String dname;
	private String dmanager;
	@OneToMany(mappedBy="dept",cascade=CascadeType.ALL)
	Set<Employee> employees=new LinkedHashSet<>();

	public int getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDmanager() {
		return dmanager;
	}

	public void setDmanager(String dmanager) {
		this.dmanager = dmanager;
	}

	public Set<Employee> getEmployess() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		for(Employee temp:employees)
		{
			temp.setDept(this);
		}
		this.employees = employees;
	}
	

}
