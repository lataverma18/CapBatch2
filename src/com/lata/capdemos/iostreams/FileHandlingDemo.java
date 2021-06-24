package com.lata.capdemos.iostreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("File1.txt",true);
	DataOutputStream dout=new DataOutputStream(fos);
	/**
	 * Code to write primitive data into the file named as file1.txt
	 */
	
	dout.writeBoolean(true);
	dout.writeInt(25);
	dout.writeChars("Hello");
	
	dout.close();
	
	FileInputStream fis=new FileInputStream("File1.txt");
	DataInputStream din=new DataInputStream(fis);
	
	System.out.println(din.readBoolean());
	System.out.println(din.readInt());
	System.out.println(din.readLine());
	
	din.close();	
		
	/*String str="Write this data to file";
	FileOutputStream fos=new FileOutputStream("File.txt");
	fos.write(str.getBytes());
	System.out.println("Written into the file");
	fos.close();*/
	}

}
