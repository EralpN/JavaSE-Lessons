package com.bilgeadam.lesson021;

public class ArrayMaxMin
{

	public static void main(String[] args)
	{
		int[] numbers = {56,34,1,8,101,-2,-33};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int number : numbers)
		{
			if (number > max)
			{
				max = number;
			}
			
			if (number < min)
			{
				min = number;
			}
		}
		
		System.out.println("Max: " + max + "\nMin: " + min);
	}

}
