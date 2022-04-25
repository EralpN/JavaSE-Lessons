package com.bilgeadam.lesson009.practice;

import java.util.Scanner;

public class Pyramid
{
	public static void main(String[] args)
	{
		int symbolUp;
		int symbolDown;
		int lineUp;
		int lineDown;
		int side = 0;

		Scanner ask = new Scanner(System.in);

		System.out.print("Length of edge: ");



		while (ask.hasNext())
		{
			
//			do
//			{
//				System.out.println("Enter a value: ");
//				ask.next();
//			}
//			while (ask.nextLine().isEmpty());

			if (ask.hasNextInt())
			{
				side = ask.nextInt();
			}
			else
			{
				System.out.print("Length of edge must be an integer: ");
				ask.next();
				continue;
			}
			if (side < 0)
			{
				System.out.print("Length of edge must be a positive: ");
				continue;
			}
			
			break;
		}


		ask.close();
		
		for (lineUp = 1; lineUp != side + 1; lineUp++)
		{
			for (symbolUp = 0; symbolUp != lineUp; symbolUp++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}

		for (lineDown = side; lineDown != 0; lineDown--)
		{
			for (symbolDown = lineDown - 1; symbolDown != 0; symbolDown--)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
