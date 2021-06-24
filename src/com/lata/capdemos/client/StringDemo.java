package com.lata.capdemos.client;

public class StringDemo {

	public static void main(String[] args) {
			String str1="Hello";
			String str2="Hello";
			
			String s=String.valueOf(12);
			System.out.println(s);
			
			System.out.println(str1==str2);
			System.out.println(str1+" World!!!");
			System.out.println(str1);
			
			String str3=new String("   Hello");
			System.out.println(str3.trim());
			String str4=new String("hello");
			System.out.println(str3.compareTo(str4));
			
			System.out.println(str3==str4);
			System.out.println(str3.equalsIgnoreCase(str4));
			System.out.println(str3+" World!!!");
			System.out.println(str3);
	}
}
