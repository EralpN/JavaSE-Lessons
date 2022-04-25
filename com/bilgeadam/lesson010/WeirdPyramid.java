package com.bilgeadam.lesson010;

import java.util.Scanner;

public class WeirdPyramid
{

	public static void main(String[] args)
	{
		Scanner ask = new Scanner(System.in);
		int height;
		System.out.print("Enter pyramid height: ");
		height = ask.nextInt();
		ask.close();

		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				if (j >= 2)
				{
					System.out.print("**");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}

}
