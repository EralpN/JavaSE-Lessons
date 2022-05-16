package com.bilgeadam.lesson021;

public class ArrayAverage
{

	public static void main(String[] args)
	{
		double[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
		double sum = 0;
		
		for (double number : numbers)
		{
			sum += number;
		}
		
		System.out.println("Sum of numbers: " + sum);
		System.out.println("Average of numbers: " + sum / numbers.length);
	}

}
