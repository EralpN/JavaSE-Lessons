package com.bilgeadam.lesson007.practice;

import java.io.FilterInputStream;
import java.util.Scanner;

public class ArithmeticOperationsScanner
{
	public double number()
	{
		double sayı;
//FilterInputStream does not allow System.in to be closed. (tempX.close() function closes system.in which causes next scanner to fail.)
		Scanner temp = new Scanner(new FilterInputStream(System.in)
		{
			public void close()
			{
			}
		});
		System.out.println("Enter the number: ");
		sayı = temp.nextDouble();
		temp.close();
		return sayı;
	}

}
