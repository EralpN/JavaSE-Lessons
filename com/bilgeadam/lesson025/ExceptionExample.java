package com.bilgeadam.lesson025;

import java.util.Scanner;

public class ExceptionExample
{

	public static void main(String[] args)
	{
		Scanner askNumber = new Scanner(System.in);

		while (true)
		{
			try
			{
				int i = askNumber.nextInt();
				System.out.println(i);
				break;
			}
			catch (Exception e)
			{
				System.err.println("Error");
			}
			finally
			{
				askNumber.nextLine();
			}
		}
		
		askNumber.close();

	}

}
