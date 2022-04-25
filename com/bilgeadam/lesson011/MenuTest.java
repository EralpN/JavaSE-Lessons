package com.bilgeadam.lesson011;

import java.util.Scanner;

public class MenuTest
{

	public static void main(String[] args)
	{
		System.out.println("Hello");
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		
		do
		{
			System.out.println("Please enter a number: ");
			String str = scanner.nextLine();
			if (str != null && !str.isEmpty() && !str.isBlank())
			{
				number = Integer.parseInt(str);
			}
		}
		while(number != 99);
		
		scanner.close();
		System.out.println("Bye");
	}

}
