package com.lata.capdemos.client;

import java.util.Arrays;

public class StringDemo2 {

	static String changeArray(int []arr)
	{
		int len=arr.length;
		StringBuilder []strArr=new StringBuilder[len];
		
		for(int i=0;i<len;i++)
			strArr[i]=new StringBuilder(String.valueOf(arr[i]));
		
		
		for(int j=0;j<len;j++)
		{
			strArr[j].reverse();
		}
		
		for(int i=0;i<len;i++)
			arr[i]=Integer.parseInt(strArr[i].toString());
		
		Arrays.sort(arr);
		return Arrays.toString(arr);
	}
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("World!!!");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		int []arr= {45,12,23,56,48};
		String str=changeArray(arr);
		System.out.println(str);
	}
}
