package com.bilgeadam.lesson008;

import java.util.Scanner;

public class IfAlternative
{
	public static void main(String[] args)
	{
		int a, b;
		Scanner getNumber = new Scanner(System.in);

		System.out.print("First Number: ");
		a = getNumber.nextInt();

		System.out.print("Second Number: ");
		b = getNumber.nextInt();

		getNumber.close();

		String output;

		// boolean ? yes : no;
		output = (a == b) ? "Numbers are equal" : (a > b) ? "First number is bigger!" : "Second number is bigger!";

		System.out.println(output);
	}
}
