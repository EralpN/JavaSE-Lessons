package com.bilgeadam.lesson008.practice;

import java.util.Scanner;

public class BodyMassIndex
{
	public static void main(String[] args)
	{
		String sex;
		String condition = "";
		
		double bodyMassIndex;
		double length;
		double weight;

		Scanner ask = new Scanner(System.in);

		do
		{
			System.out.print("Your sex m/f: ");
			sex = ask.nextLine();
		}
		while (!(sex.equalsIgnoreCase("m") || sex.equalsIgnoreCase("f")));

		System.out.print("Your length: ");
		length = ask.nextDouble();

		System.out.print("Your weight: ");
		weight = ask.nextDouble();

		ask.close();

		bodyMassIndex = (weight * 10000) / Math.pow(length, 2);

		if (sex.equalsIgnoreCase("m"))
		{ // Male
			if (bodyMassIndex <= 20)
			{
				condition = "Underweight";
			}
			else if (bodyMassIndex <= 25)
			{
				condition = "Normal";
			}
			else if (bodyMassIndex <= 30)
			{
				condition = "Overweight";
			}
			else
			{
				condition = "Obese";
			}
		} // Female
		else if (sex.equalsIgnoreCase("f"))
		{
			if (bodyMassIndex <= 19)
			{
				condition = "Underweight";
			}
			else if (bodyMassIndex <= 24)
			{
				condition = "Normal";
			}
			else if (bodyMassIndex <= 30)
			{
				condition = "Overweight";
			}
			else
			{
				condition = "Obese";
			}
		}
		else
		{
			System.out.println("Invalid Sex!");
			System.exit(0);
		}
		System.out.println("BMI: " + bodyMassIndex + "\nCondition: " + condition);
	}
}
