package com.bilgeadam.lesson010;

import java.util.Scanner;

public class HcfLcm
{

	public static void main(String[] args)
	{
		int highestCommonFactor = 1, lowestCommonMultiplier = 1;
		int number1, number2, biggerNumber, smallerNumber;

		Scanner ask = new Scanner(System.in);

		do
		{
			System.out.print("Enter number 1: ");
			number1 = ask.nextInt();
		}
		while (!(number1 > 0));

		do
		{
			System.out.print("Enter number 2: ");
			number2 = ask.nextInt();
		}
		while (!(number1 > 0));

		ask.close();

		if (number1 > number2)
		{
			biggerNumber = number1;
			smallerNumber = number2;
		}
		else
		{
			smallerNumber = number1;
			biggerNumber = number2;
		}

//		int j = biggerNumber;

		for (int i = 2; i <= smallerNumber; i++)
		{
			while (biggerNumber % i == 0 && smallerNumber % i == 0)
			{
				highestCommonFactor = highestCommonFactor * i;
				biggerNumber = biggerNumber / i;
				smallerNumber = smallerNumber / i;
			}
		}
		System.out.print("Highest Common Factor = " + highestCommonFactor);


//		for (int i = j; i <= number1 * number2; i++)
//		{
//			if (i % number1 == 0 && i % number2 == 0)
//			lowestCommonMultiplier = i;
//		}
		
		lowestCommonMultiplier = (number1 * number2) / highestCommonFactor; //better way of doing it.
		
		System.out.print("\nLowest Common Multiplier = " + lowestCommonMultiplier);
	}

}
