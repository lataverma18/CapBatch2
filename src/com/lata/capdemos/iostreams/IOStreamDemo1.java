package com.lata.capdemos.iostreams;

import java.io.IOException;
import java.io.InputStream;

public class IOStreamDemo1 {

	public static void main(String[] args) throws IOException {
	
		
	InputStream is=System.in;
	int i=is.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=is.read();
	}
	}
}
