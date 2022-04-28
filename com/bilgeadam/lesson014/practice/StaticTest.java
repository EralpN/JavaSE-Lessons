package com.bilgeadam.lesson014.practice;

public class StaticTest
{

	// non static
	int multiply (int a , int b)
	{
		return a * b;
	}
	
	String nonStaticVar = "Non Static";
	
	
	
	// static
	static int add (int a, int b)
	{
		return a + b;
	}
	
	static String staticVar = "Static";
	
	
	
	public static void main(String[] args)
	{
		
		// static
		System.out.println(add(5, 6));
		
		// non static
		StaticTest test = new StaticTest();
		System.out.println(test.multiply(5, 6));
		
		
	}
	
}
