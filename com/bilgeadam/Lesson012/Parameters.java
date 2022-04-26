package com.bilgeadam.Lesson012;

public class Parameters
{

	public static void main(String[] args)
	{
		System.out.println("3 + 2 = " + add(3, 2));
		System.out.println("3 * 2 = " + multiply(3, 2));
		System.out.println("2 ^ 2 = " + square(2));
		System.out.println("3 ^ 2 = " + power(3, 2));
	}

	private static int add(int a, int b)
	{
		return a + b;
	}
	
	private static int multiply(int a, int b)
	{
		return a * b;
	}
	
	private static int square(int a)
	{
		return multiply(a, a);
	}
	
	private static int power(int a, int b)
	{
		int c = 1;
		for (int i = 0; i < b; i++)
		{
			c = multiply(c, a);
		}
		return c;
	}
}
