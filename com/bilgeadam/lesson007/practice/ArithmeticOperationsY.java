package com.bilgeadam.lesson007.practice;

import java.util.Scanner;

public class ArithmeticOperationsY
{
	public double numberY()
	{
	double y;
	Scanner tempY = new Scanner(System.in);
	System.out.println("Enter the second number: ");
	y = tempY.nextDouble();
	tempY.close(); //sonuncu scanner stepde kapanması lazım
	return y;
	}
	
}