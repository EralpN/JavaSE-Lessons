package com.bilgeadam.lesson014.practice;

public class StaticTest2
{
	public static void main(String[] args)
	{
		
		
		// static
		System.out.println(StaticTest.add(5, 6));
		System.out.println(StaticTest.staticVar);
		
		// non static
		StaticTest test = new StaticTest();
		System.out.println(test.multiply(5, 6));
		System.out.println(test.nonStaticVar);
		
		
	}
}
