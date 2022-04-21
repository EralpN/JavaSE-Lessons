package com.bilgeadam.mightNeedLater;

import java.util.Scanner;

public class IsItInteger
{

	public static void main(String[] args)
	{

		int number = 0;

		Scanner ask = new Scanner(System.in);

		System.out.print("Please enter a positive integer: ");

		while (ask.hasNext())
		{

			if (ask.hasNextInt())
			{
				number = ask.nextInt();
			}
			else
			{
				System.out.print("Input must be integer: ");
				ask.next();
				continue;
			}
			if (number < 0)
			{
				System.out.print("Input must be positive: ");
				continue;
			}
			// At this stage, the number is a positive integer
			break;
		}

		ask.close();
		System.out.println("User entered: " + number);

	}

}
