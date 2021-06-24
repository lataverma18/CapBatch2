package com.lata.capdemos.iostreams;

import java.io.IOException;

public class ReadKeys {

	public static void main(String[] args) throws IOException {
			 StringBuilder sb = new StringBuilder(); 
			 char c;
		     System.out.println("Enter a String:");
		     byte []arr=new byte[40];
		     int out=System.in.read(arr);
		     /*
		 	 try {
			       while((c =(char)System.in.read()) != '\n')    
		                    sb.append(c); 
		      }catch(Exception e){  
		            System.out.println("Error while reading" + e.getMessage()); }
		  String s = new String(sb);*/
		  System.out.println("You entered : " + new String(arr));

	}

}
