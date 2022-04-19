package com.bilgeadam.lesson007.homework;

import java.util.Scanner;

public class TemperatureConversion
{

	public static void main(String[] args)
	{
		double degrees;
		double celsius;

		Scanner temp = new Scanner(System.in);
		System.out.print("Temperute in Fahreheit: ");
		degrees = temp.nextInt();
		temp.close();

		celsius = (degrees - 32) / 1.8;

		System.out.println("Temperature in Celsius: " + celsius);
	}

}
