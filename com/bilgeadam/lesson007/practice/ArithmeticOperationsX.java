package com.bilgeadam.lesson007.practice;

import java.io.FilterInputStream;
import java.util.Scanner;

public class ArithmeticOperationsX
{
	public double numberX()
	{
		double x;
//FilterInputStream does not allow System.in to be closed. (tempX.close() function closes system.in which causes next scanner to fail.)
		Scanner tempX = new Scanner(new FilterInputStream(System.in)
		{
			public void close()
			{
			}
		});
		System.out.println("Enter the first number: ");
		x = tempX.nextDouble();
		tempX.close();
		return x;
	}

}
