package com.bilgeadam.lesson007.practice;

import java.util.Scanner;

public class ScannerTest
{
	public static void main(String[] args)
	{
		double a, b, c;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a = scanner.nextInt();

		System.out.print("Enter second number: ");
		b = scanner.nextInt();

		System.out.print("Enter third number: ");
		c = scanner.nextInt();

		System.out.print("İşlem: " + a + " (" + b + " + " + c + ") = " + a * (b + c));

		scanner.close();
	}
}
