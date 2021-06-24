package com.lata.capdemos.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
	List<Employee> getEmployeesAboveSalary(List<Employee> list,int salary)
	{
		return list.stream().filter(emp->emp.getEmployeeSalary()>50000).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(5,7,3,9);
		Optional<Integer> result = intList.stream().reduce((a,b)->a+b);
		if(result.isPresent()) {
			System.out.println("Result:"+result.get());
		}
		
		
	List<Employee> list=new ArrayList<>();
	list.add(new Employee(101,"Ronit",56000,"Prod"));
	list.add(new Employee(102,"Rohit",66000,"IT"));
	list.add(new Employee(103,"Rita",52000,"Prod"));
	list.add(new Employee(104,"Geeta",46000,"IT"));
	list.add(new Employee(105,"Neha",52000,"Prod"));
	
	Map<String,Long> map=(Map<String,Long>)list.stream().collect(Collectors.groupingBy(Employee::getEmployeeDept,Collectors.counting()));
	System.out.println(map);
	
	/*//list.forEach(System.out::println);
	for(int i=0;i<3;i++)
		System.out.println(list.get(i).getEmployeeId());
	for(Employee emp:list)
	{
		System.out.println(emp.getEmployeeId());
	}
	
	Stream<Employee> stream=list.stream();
	//stream.map(obj->obj.getEmployeeId()).limit(3).forEach(System.out::println);
	stream.filter(emp->emp.getEmployeeSalary()>50000).map(obj->obj.getEmployeeSalary()).distinct().forEach(System.out::println);
	
	*/
	

	}
}
