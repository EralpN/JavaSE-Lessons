package com.bilgeadam.lesson008;

import java.util.Scanner;

public class IfUsage
{
	public static void main(String[] args)
	{
		int a;
		int b;
		
		Scanner getNumber = new Scanner(System.in);

		System.out.print("First Number: ");
		a = getNumber.nextInt();

		System.out.print("Second Number: ");
		b = getNumber.nextInt();

		getNumber.close();

		if (a == b)
		{
			System.out.print("Numbers are equal");
		}
		else if (a > b)
		{
			System.out.print("First number is bigger!");
		}
		else
		{
			System.out.print("Second number is bigger!");
		}
	}
}
