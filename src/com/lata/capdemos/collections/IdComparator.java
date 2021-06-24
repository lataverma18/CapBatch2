package com.lata.capdemos.collections;

import java.util.Comparator;

public class IdComparator<T> implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		/*if(arg0 instanceof Student)
		{
			Student s1=(Student)arg0;
			Student s2=(Student)arg1;
			return s1.getStuId()-s2.getStuId();
		}*/
		if(arg0 instanceof Employee)
		{
			return arg0.getEmployeeId()-arg1.getEmployeeId();
		}
		return 0;
	}
}
