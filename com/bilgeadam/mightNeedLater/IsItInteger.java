package com.bilgeadam.mightNeedLater;

import java.util.Scanner;

public class IsItInteger
{

	public static void main(String[] args)
	{
		System.out.print("Please enter a number: ");

		try (Scanner scan = new Scanner(System.in))
		{
			while (scan.hasNext())
			{
				int number;
				if (scan.hasNextInt())
				{
					number = scan.nextInt();
				}
				else
				{
					System.out.print("Please enter a valid number: ");
					scan.next();
					continue;
				}

				if (number < 0)
				{
					System.out.print("Please enter a number > 0: ");
					continue;
				}

				// At this stage, the number is an integer >= 0
				System.out.println("User entered: " + number);
				break;
			}
		}
	}

}
