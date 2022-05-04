package com.bilgeadam.esson012;

public class FactorialRunTime
{

	public static void main(String[] args)
	{
		int number = 150;
		int numberOfTries = 1;
		double factorial;
		int j = 0;
		long timeClassic = 0;
		long timeRecursive = 0;
		while (j < numberOfTries)
		{
			long start = System.nanoTime();
			factorial = calculateClassicalFactorial(number);
			long stop = System.nanoTime();
			long time1 = stop - start;

			System.out.println("Factorial of " + number + " is equal to " + factorial + "\tTime: " + time1);

			start = System.nanoTime();
			factorial = calculateRecursiveFactorial(number);
			stop = System.nanoTime();
			long time2 = stop - start;

			System.out.println("Factorial of " + number + " is equal to " + factorial + "\tTime: " + time2);
			
			timeClassic = timeClassic + time1;
			timeRecursive = timeRecursive + time2;
			j++;
		}
		
		timeClassic = timeClassic / numberOfTries;
		timeRecursive = timeRecursive / numberOfTries;
		
		System.out.println("Average time of classic function:\t" + timeClassic + "\nAverage time of recursive function:\t" + timeRecursive);
		
		
	}

	private static double calculateClassicalFactorial(int number)
	{
		double result = 1;
		for (int i = 0; i < number; i++)
		{
			result = result * (number - i);
		}
		return result;
	}

	private static double calculateRecursiveFactorial(int number)
	{
		if (number == 0 || number == 1)
		{
			return 1;
		}
		else
		{
			return number * calculateRecursiveFactorial(--number);
		}
	}
}
