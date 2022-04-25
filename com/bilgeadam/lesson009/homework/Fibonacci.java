package com.bilgeadam.lesson009.homework;

import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner ask = new Scanner(System.in);

		int temp = 0;
		int prev = 0;
		int current = 1;
		int order;
		int i;

		System.out.println("This program calculates the Fibonacci number at a given order from 1 to 47.");

		do
		{
			System.out.print("Order of your Fibonacci number: ");
			order = ask.nextInt();
			if (order == 1)
			{
				System.out.print("0\nYour Fibonacci number: 0");
				System.exit(0);
			}
			if (order == 2)
			{
				System.out.print("0 1\nYour Fibonacci number: 1");
				System.exit(0);
			}
		}
		while (!(order > 2 && order < 48));

		ask.close();

		System.out.print("0 1 ");

		for (i = 1; i != order - 1; i++)
		{
			temp = current;
			current = current + prev;
			prev = temp;
			System.out.print(current + " ");
		}
		System.out.print("\nYour Fibonacci number: " + current);
	}
}
