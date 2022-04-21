package com.bilgeadam.lesson009.practice;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		System.out.println("Number should be between 0 and 23!");

		int number;
		Scanner ask = new Scanner(System.in);

		do
		{
			System.out.print("Number to calculate (99 -> Ext): ");
			number = ask.nextInt();
			if (number == 99)
			{
				System.err.println("Exit, program terminated!");
				System.exit(0);
			}
		}
		while (!(number >= 0 && number < 23));

		ask.close();

		double result = 1;
		double i = 1;

		while (true)
		{
			if (i <= number)
			{
				result = result * i;
				i++;
			}
			else
			{
				break;
			}
		}
		System.out.println(number + "! = " + result);

	}
}
