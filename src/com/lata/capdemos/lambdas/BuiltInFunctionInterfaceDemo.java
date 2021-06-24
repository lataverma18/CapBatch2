package com.lata.capdemos.lambdas;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionInterfaceDemo {

	public static void main(String[] args) {
	DoubleSupplier d=()->Math.PI;
	System.out.println(d.getAsDouble());
	
	Supplier<Double> s=()->Math.PI;
	System.out.println(s.get());
	
	Consumer<String> c=str->System.out.println("No of characters here is:"+str.length());
	c.accept("Lata");
	
	Predicate<Integer> p=num-> num%2==0;
	System.out.println("Is this even number? "+p.test(19));
	
	Function<String,Integer> f=str->str.codePointAt(0);
	System.out.println(f.apply("Lata"));
	
	}
}
