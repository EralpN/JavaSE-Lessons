package com.bilgeadam.Lesson012;

import java.util.Random;

public class Dodecaphobia
{

	public static void main(String[] args)
	{
		int upperBound = 20;
		int unwantedNumber = 12;
		
		
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
		System.out.println("This random number is not " + unwantedNumber + ": " + getRandomNumber(upperBound, unwantedNumber));
	}

	private static int getRandomNumber(int upperBound, int unwantedNumber)
	{
		Random random = new Random();
		int number;
		do
		{
		number = random.nextInt(upperBound + 1);
		}
		while (number == unwantedNumber);
		return number;
	}

}
