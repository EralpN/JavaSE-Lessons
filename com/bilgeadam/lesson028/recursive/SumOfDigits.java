package com.bilgeadam.lesson028.recursive;

public class SumOfDigits
{

	public static void main(String[] args)
	{
		int number = 421;
		
		System.out.println(sumDigits(number));

	}

	
	private static int sumDigits(int number)
	{
		return number == 0 ? 0 : number % 10 + sumDigits(number / 10);
	}
}
