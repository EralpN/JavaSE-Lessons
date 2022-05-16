package com.bilgeadam.lesson021;

public class Foreach
{
	public static void main(String[] args)
	{
		int[] numbers = { 1, 2, 3 };
		for (int number : numbers)
		{
			System.out.print(number);
		}

		System.out.println();

		for (int number : numbers)
		{ //only reads does not write.
			number += 2;
			System.out.print(number);
		}

		System.out.println();

		for (int number : numbers)
		{
			System.out.print(number);
		}

		System.out.println();

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] += 2;
			System.out.print(numbers[i]);
		}

		System.out.println();

		for (int number : numbers)
		{
			System.out.print(number);
		}
	}
}
