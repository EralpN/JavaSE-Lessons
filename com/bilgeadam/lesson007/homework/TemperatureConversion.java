package com.bilgeadam.lesson007.homework;

import java.util.Scanner;

public class TemperatureConversion
{

	public static void main(String[] args)
	{
		double fahrenheit;
		double celsius;

		Scanner temp = new Scanner(System.in);
		System.out.print("Temperute in Fahreheit: ");
		fahrenheit = temp.nextInt();
		temp.close();

		celsius = (fahrenheit - 32) / 1.8;

		System.out.println("Temperature in Celsius: " + celsius);
	}

}
