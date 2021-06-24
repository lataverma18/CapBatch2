package com.lata.capdemos.inheritance;

abstract class Animal
{
	int weight;
	abstract String sound();

	Animal()
	{
		System.out.println("Animal Constructor!!!"+weight);
	}
	void notHumanBeing()
	{
		System.out.println("It is not human being!!!");
	}
}

class Dog extends Animal
{
	@Override
	public String sound()
	{
		return "Barksss...";
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
	Animal an=new Dog();
	an.notHumanBeing();
	System.out.println(an.sound());
	}
}
