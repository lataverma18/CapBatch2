package com.lata.jpalayereddemo.mappers;

import com.lata.jpalayereddemo.dto.EmployeeDto;
import com.lata.jpalayereddemo.entities.Employee;

public class EmployeeMapper {
	public static EmployeeDto toEmployeeDtoMapping(Employee e)
	{
		EmployeeDto edto=new EmployeeDto();
		edto.setEmpid(e.getEmpid());
		edto.setEmpname(e.getEmpname());
		edto.setEmpsalary(e.getEmpsalary());
		edto.setEmpdoj(e.getEmpdoj());
		edto.setEmpdept(e.getEmpdept());
		return edto;
	}

	
}
