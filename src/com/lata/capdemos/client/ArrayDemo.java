package com.lata.capdemos.client;

import java.util.Arrays;

import com.lata.capdemos.beans.Employee;
import com.lata.capdemos.enums.Department;

public class ArrayDemo {

	static int[] displayElements(int []arr1)
	{
		for(int i=0;i<arr1.length;i++)
			arr1[i]++;
		
		return arr1;
	}
	static int sum(int ...varargs)
	{
		int s=0;
		
		for(int i=0;i<varargs.length;i++)
			s+=varargs[i];
		
		return s;
	}
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		
		System.out.println(sum(10,20,30));
		System.out.println(sum());
		System.out.println(sum(12,34));
		
		Employee []employees=new Employee[3];
		for(int i=0;i<3;i++)
		{
			employees[i]=new Employee();
			//UserInput for id,name,depart
			employees[i].setEmployeeId(101);
			employees[i].setEmployeeName("Ronit");
			employees[i].setEmployeeDept(Department.IT);
		}
		
		for(Employee emp:employees)
			System.out.println(emp.getEmployeeId()+"\t"+emp.getEmployeeName()+"\t"+emp.getEmployeeDept());
			
		System.exit(0);
		int []arr= {90,78,56,34};
		Arrays.sort(arr);
		for(int temp:arr)
			System.out.println(temp);
		/*int []arr[]=new int	[3][];
	arr[0]=new int[2];
	arr[1]=new int[1];
	arr[2]=new int[2];
	
	int []arr1[]=new int[][] {{10,20},{30,40},{50,60}};
	int []arr2= {10,20};
	
	for(int[] temp :arr)
	{
		for(int value:temp)
			System.out.print(value+" ");
		
		System.out.println();
	}
		
		
	int [] arr= {10,20,30,40,50};
	
	int []des=displayElements(arr);
	
	for(int temp:des)
		System.out.println(temp);
	
	int n=-3;
 
	System.out.println(-3>>>1);
	*/
		long endTime=System.currentTimeMillis();
		System.out.println("Total Time taken "+(endTime-startTime));
	}
}
