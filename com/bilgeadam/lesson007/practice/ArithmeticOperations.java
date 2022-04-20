package com.bilgeadam.lesson007.practice;

public class ArithmeticOperations
{
	public static void main(String[] args)
	{
		ArithmeticOperationsScanner getNumber = new ArithmeticOperationsScanner();

		double x = getNumber.number();
		double y = getNumber.number();

		double sum, diff, multi, div, mod;

		sum = x + y;
		diff = x - y;
		multi = x * y;
		div = x / y;
		mod = x % y;

		System.out.println("Sum: " + sum);
		System.out.println("Diff: " + diff);
		System.out.println("Multip: " + multi);
		System.out.println("Div: " + div);
		System.out.println("Remainder: " + mod);
	}
}
