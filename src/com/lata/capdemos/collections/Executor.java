package com.lata.capdemos.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Executor {

	public static void main(String[] args) {
		Set<Employee> s=new TreeSet<>(new IdComparator<Employee>()); 
		s.add(new Employee("Ronit",101,87000));  //obj1
		s.add(new Employee("Rohit",102,56000));  //obj2   obj2.equals(obj1)
		s.add(new Employee("Ronit",105,87000));		//obj3	obj3.equals(obj2)...
		s.add(new Employee("Neha",104,66000));
		s.add(new Employee("Neeti",103,54000));
		
		Iterator<Employee> it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
