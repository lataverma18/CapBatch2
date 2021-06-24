package com.lata.capdemos.threads;

public class SynchronizationDemo1 {

	public static void main(String[] args) {
	Printer p=new Printer();
	
	Thread m1=new Thread(new Machine(p),": Machine 1");
	Thread m2=new Thread(new Machine(p),": Machine 2");
	Thread m3=new Thread(new Machine(p),": Machine 3");
	Thread m4=new Thread(new Machine(p),": Machine 4");
	Thread m5=new Thread(new Machine(p),": Machine 5");
	
	m1.start();
	m2.start();
	m3.start();
	m4.start();
	m5.start();

	}
}
