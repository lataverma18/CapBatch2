package com.lata.capdemos.iostreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("MyImages");
		File []fnames=f.listFiles();
		for(File temp:fnames)
			System.out.println(temp.getName()+"\t"+temp.canWrite()+"\t"+temp.getParent());
	}
}
