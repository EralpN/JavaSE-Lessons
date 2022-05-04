package com.bilgeadam.esson012.homework;

import java.util.Scanner;

public class CalculatorWithMethods
{

	static double number1;
	static double number2;
	static int operation;
	static Scanner ask = new Scanner(System.in);
	static Scanner menuAsk = new Scanner(System.in);

	public static void main(String[] args)
	{

		getNumbers();
		chooseOperation();
		double result = doOperation();

		System.out.print("The result of the operation is: ");
		System.err.println(result);

	}

	public static void getNumbers()
	{
		System.out.print("Enter first number: ");
		number1 = ask.nextDouble();

		System.out.print("Enter second number: ");
		number2 = ask.nextDouble();
	}

	public static int chooseOperation()
	{
		System.out.println("Choose your desired operation:");
		System.out.println("1 - Summation");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("5 - Find Remainder (first/second)");
		
		while (menuAsk.hasNext())
		{
			if (menuAsk.hasNextInt())
			{
				operation = menuAsk.nextInt();
			}
			else
			{
				System.out.print("Please select one of the given operations: ");
				menuAsk.next();
				continue;
			}
			if (!(operation > 0 && operation < 6))
			{
				System.out.print("Please select one of the given operations: ");
				continue;
			}
			break;
		}
		return operation;
	}

	public static double doOperation()
	{
		double result = 0;

		switch (operation)
		{
		case 1:
			result = summation(number1, number2);
			return result;
		case 2:
			result = subtraction(number1, number2);
			return result;
		case 3:
			result = multiplication(number1, number2);
			return result;
		case 4:
			result = division(number1, number2);
			return result;
		case 5:
			result = remainder(number1, number2);
			return result;
		default:
			System.err.println("Error!");
			System.exit(0);
			return result;
		}
	}

	public static double summation(double number1, double number2)
	{
		return number1 + number2;
	}

	public static double subtraction(double number1, double number2)
	{
		return number1 - number2;
	}

	public static double multiplication(double number1, double number2)
	{
		return number1 * number2;
	}

	public static double division(double number1, double number2)
	{
		return number1 / number2;
	}

	public static double remainder(double number1, double number2)
	{
		return number1 % number2;
	}

}
