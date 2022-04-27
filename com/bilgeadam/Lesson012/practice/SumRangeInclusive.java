package com.bilgeadam.lesson012.practice;

import java.util.Scanner;

public class SumRangeInclusive
{

	public static void main(String[] args)
	{
		
		Scanner ask = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = ask.nextInt();
		System.out.println("Enter second number: ");
		int number2 = ask.nextInt();
		int bigNumber = 0;
		int smallNumber = 0;
		
		if (number1 > number2)
		{
			bigNumber = number1;
			smallNumber = number2;
		}
		else if (number2 > number1)
		{
			bigNumber = number2;
			smallNumber = number1;
		}
		else
		{
			System.out.println("Your numbers are equal!");
			System.exit(0);
		}
		
		System.out.println("The sum of number between given numbers is: " + sumRangeInclusive(smallNumber, bigNumber) + " (inclusive)");
		ask.close();
	}
	
	public static long sumRangeInclusive(int smallNumber, int bigNumber)
	{

		if (bigNumber < smallNumber)
		{
			return 0;
		}
		else
		{
			return smallNumber + sumRangeInclusive(++smallNumber, bigNumber);
		}
		
		
		
	}

}
