package com.bilgeadam.lesson011.practice;

public class IsEqual
{

	public static void main(String[] args)
	{
		int firstPrimitive = 5;
		int secondPrimitive = 5;
		
		if (firstPrimitive == secondPrimitive)
		{
			System.out.println("Both numbers are ==.");
		}
		else
		{
			System.out.println("Numbers are not ==.");
		}
		
//		Integer firstWrapper = new Integer(5);
//		Integer secondWrapper = new Integer(5);
//		
//		if (firstWrapper == secondWrapper)
//		{
//			System.out.println("Both numbers are ==.");
//		}
//		else
//		{
//			System.out.println("Numbers are not ==.");
//		}
		
		String firstString = new String("5");
		String secondString = new String("5");
		
		if (firstString == secondString)
		{
			System.out.println("Both numbers are ==.");
		}
		else
		{
			System.out.println("Numbers are not ==.");
		}
	}

} // == checks for the equality of the data address
