package com.bilgeadam.Lesson012.practice;

import java.util.Scanner;

public class IsEven
{

	public static void main(String[] args)
	{
		Scanner ask = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = ask.nextInt();
		if (isEven(number))
		{
			System.out.println("The number is even.");
		}
		else
		{
			System.out.println("The number is odd");
		}
		ask.close();
	}
	
	public static boolean isEven(int number)
	{
		boolean even;
		if (number % 2 == 0)
		{
			even = true;
		}
		else
		{
			even = false;
		}
		return even;
	}
	

}
