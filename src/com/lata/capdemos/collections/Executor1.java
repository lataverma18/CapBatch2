package com.lata.capdemos.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Executor1 {

	public static void main(String[] args) {
	ArrayList arr=new ArrayList();
	arr.add(new Student(101,"Raj"));
	arr.add(new Student(105,"Ramika"));
	arr.add(new Student(102,"Deepa"));
	arr.add(new Student(104,"Neha"));
	arr.add(new Student(105,"Ramika"));
	
	Collections.sort(arr, new IdComparator());   //obj2.compareTo(obj1)
	
	Iterator it=arr.iterator();
	while(it.hasNext())
		System.out.println(it.next());

	Collections.sort(arr, new NameComparator());   //obj2.compareTo(obj1)
	
	it=arr.iterator();
	while(it.hasNext())
		System.out.println(it.next());

	}
}
