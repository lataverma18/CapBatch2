package com.lata.capdemos.client;

import java.util.Arrays;

public class StringDemo1 {
	static String sortString(String []str)
	{
		Arrays.sort(str);
		int mid=str.length/2;
		int len=str.length;
		for(int i=0;i<mid;i++)
			str[i]=str[i].toUpperCase();
		
		for(int j=mid+1;j<len;j++)
			str[j]=str[j].toLowerCase();
		
		if((len%2)!=0)
			str[mid]=str[mid].toUpperCase();
		
		return Arrays.toString(str);
	}
	public static void main(String[] args) {
		String str[]= {"Lata","Neha","Mansi","Mamta","Bunny"};
		
		String result=sortString(str);
		System.out.println(result);
	}

}
