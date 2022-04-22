package com.bilgeadam.mightNeedLater;

import java.util.Scanner;

public class DetectBlank
{

	public static void main(String[] args)
	{
		
		
		Scanner ask = new Scanner(System.in);

		System.out.print("Enter something: ");
		
		int deneme = 0;
		
		String empty = ask.nextLine();
		
		
		while (empty.trim().equals(""))
		{
			System.out.print("Enter something: ");
			empty = ask.nextLine();
		}
		
		ask.close();
		
		deneme = Integer.parseInt(empty);
		System.out.print("Out " + deneme);
		
	}

}
