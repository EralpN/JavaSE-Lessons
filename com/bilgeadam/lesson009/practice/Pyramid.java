package com.bilgeadam.lesson009.practice;

import java.util.Scanner;

public class Pyramid
{
	public static void main(String[] args)
	{
		int symbolUp = 0, symbolDown, lineUp, lineDown, side = 0;

		Scanner ask = new Scanner(System.in);

		System.out.print("Length of edge: ");

		while (ask.hasNext())
		{
			if (ask.hasNextInt())
			{
				int sideTemp;
				sideTemp = ask.nextInt();
				side = sideTemp;
			}
			else
			{
				System.out.print("Length of edge must be a positive integer: ");
				ask.next();
				continue;
			}
			if (side < 0)
			{
				System.out.print("Length of edge must be a positive integer: ");
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
