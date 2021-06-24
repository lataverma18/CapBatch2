package com.lata.capdemos.collections;

import java.util.ArrayList;
import java.util.List;

class A
{
	
}
class B extends A
{
	
}
class C extends A{}
public class GenericsDemo {

	static void displayAll(List<? super A> list)
	{
		System.out.println(list);
	}
	public static void main(String[] args) {
		
		List<B> list1=new ArrayList<>();
		List<A> list2=new ArrayList<>();
		List<Object> list3=new ArrayList<>();
		List<C> list4=new ArrayList<>();

		
		displayAll(list1);
		displayAll(list2);
		displayAll(list3);
		displayAll(list4);
	}
}
