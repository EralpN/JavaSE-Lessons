package com.bilgeadam.lesson009.practice;

import java.util.Scanner;

public class PrimeNumber
{
public static void main(String[] args)
{
	Scanner ask = new Scanner(System.in);
	int number;
	int i = 2;
	
	do
	{
	System.out.print("Imput a number bigger than 1: ");
	number = ask.nextInt();
	}
	while (number <= 1);
	
	ask.close();
	
	while(i < number)
	{
		if ((number % (i)) > 0)
		{
			i++;
		}
		else
		{
			System.out.println(number + " is not a prime number.");
			System.exit(0);
		}
		
	}
	System.out.println(number + " is a prime number.");
}
}
