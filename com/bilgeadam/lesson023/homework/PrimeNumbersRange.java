package com.bilgeadam.lesson023.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersRange
{
	private ArrayList<Integer> numbers = new ArrayList<>();
	private ArrayList<Integer> primeNumbers = new ArrayList<>();
	private ArrayList<Boolean> isPrimes = new ArrayList<>();
	
	private final int primeStart = 2;

	private int rangeLast;
	private int rangeFirst;

	public static void main(String[] args)
	{
		PrimeNumbersRange primes = new PrimeNumbersRange();

		primes.askRange();
		primes.initiateNumbers();
		primes.detectPrimeNumbers();
		primes.printPrimeNumbers();
	}

	private void askRange()
	{
		Scanner ask = new Scanner(System.in);

		do
		{
			System.out.print("Please enter the lower bound: ");
			rangeFirst = ask.nextInt();
		}
		while (!(rangeFirst > 0));

		do
		{
			System.out.print("Please enter the upper bound: ");
			rangeLast = ask.nextInt();
		}
		while (!(rangeLast > 0 && rangeLast > rangeFirst));

		ask.close();
	}

	private void initiateNumbers()
	{
		for (int i = 0; i <= (rangeLast - primeStart); i++)
		{
			isPrimes.add(true);
			numbers.add(i + primeStart);
		}
	}

	private void detectPrimeNumbers()
	{
		for (int i = primeStart; i <= rangeLast; i++)
		{
			for (int j = primeStart; j < i; j++)
			{
				if (i != j)
				{
					if ((i % j) == 0)
					{
						if (isPrimes.get(i - primeStart))
						{
							isPrimes.set(i - primeStart, false);
						}
					}
				}
			}
		}
	}

	private void printPrimeNumbers()
	{
		for (int i = 0; i <= (rangeLast - primeStart); i++)
		{
			if (isPrimes.get(i) == true && numbers.get(i) >= rangeFirst)
			{
				primeNumbers.add(numbers.get(i));
			}
		}

		System.out.println(primeNumbers);
	}

}
