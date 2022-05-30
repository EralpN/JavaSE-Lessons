package com.bilgeadam.lesson025.practice;

import java.util.Scanner;

public class ExceptionHandlingExample
{

	public static void main(String[] args) throws NumberInputException, PuncuationInputException, SpaceInputException
	{
		Scanner askString = new Scanner(System.in);
		readOnlyStrings(askString);
		
	}

	private static void readOnlyStrings(Scanner askString)
			throws NumberInputException, PuncuationInputException, SpaceInputException
	{
		System.out.println();
		System.out.print("Please write something");
		String string = askString.nextLine();
		char[] chars = string.toCharArray();
		for (char c : chars)
		{
			if (c >= '0' && c <= '9')
			{
				throw new NumberInputException("You cant enter numbers");
			}
			else if (c >= '!' && c <= '/')
			{
				throw new PuncuationInputException("You cant enter special characters");
			}
			else if (c == ' ')
			{
				throw new SpaceInputException("You cant enter space");
			}

		}

	}
}
