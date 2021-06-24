package com.lata.capdemos.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Employee emp=new Employee(101,"Ronit");
		File f=new File("employeeData.txt");
	/*	FileOutputStream fw=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fw);
		oos.writeObject(emp);
		System.out.println("Object Saved!!!");
		oos.close();
	*/
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e1=(Employee)ois.readObject();
		System.out.println(e1);
		
	}

}
