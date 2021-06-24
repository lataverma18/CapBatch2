package com.lata.capdemos.inheritance;

interface Inf1
{
	void get();
}
interface Inf2
{
	void get();
}
interface Inf3
{
	void get();
}
class Multi implements Inf1,Inf2,Inf3
{
	public void set() {
		System.out.println("set of Multi");	
	}

	public void put() {
		System.out.println("put of Multi");
	}

	@Override
	public void get() {
		System.out.println("get of Multi");
	}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Multi m=new Multi();
		m.get();
		m.put();
		m.set();
	}

}
