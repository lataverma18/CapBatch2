package com.lata.capdemos.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileHandlingDemo1 {

	public static void main(String[] args) throws IOException {
		/*String str="Data to write into the File";
		FileWriter fw=new FileWriter("File2.txt");
		fw.write(str);
		System.out.println("Written into the File");
		fw.close();*/
		
		File f=new File("File2.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		LineNumberReader lnr=new LineNumberReader(br);
		String str=lnr.readLine();
		while(str!=null)
		{
			System.out.println(lnr.getLineNumber()+"-"+str);
			str=lnr.readLine();
		}
	}
}
