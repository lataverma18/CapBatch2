package com.lata.capdemos.methodreferences;

import java.util.ArrayList;
import java.util.List;

interface Inf5
{
	String operateN(char[] ch);
}
public class MethodReferenceDemo1 {
	
	public static void main(String []args)
	{	
		//String str=new String("Lata");
		//Inf5 i5=String::valueOf;
		//System.out.println(i5.operateN(2)+5);
		char []ch= {'a','b','c'};
		Inf5 i5=String::new;
		
		System.out.println(i5.operateN(ch));
		
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("Hi");
		list.add("Ciya");
		list.add("Bye");
		
		//list.forEach((str1)->System.out.println(str1));
		list.forEach(System.out::println);
		
		/*for(String temp:list)
			System.out.println(temp);*/
	}
}
