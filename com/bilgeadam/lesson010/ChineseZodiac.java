package com.bilgeadam.lesson010;

import java.util.Scanner;

public class ChineseZodiac
{
	public static void main(String[] args)
	{
		Scanner ask = new Scanner(System.in);

		int year;

		do
		{
			System.out.print("Year of birth: ");
			year = ask.nextInt();
		}
		while (!(year > 1950 && year < 2050));

		ask.close();

		String zodiac = "";

		switch (year % 12)
		{
		case 0:
			zodiac = "Monkey";
			break;
		case 1:
			zodiac = "Rooster";
			break;
		case 2:
			zodiac = "Dog";
			break;
		case 3:
			zodiac = "Pig";
			break;
		case 4:
			zodiac = "Mouse";
			break;
		case 5:
			zodiac = "Ox";
			break;
		case 6:
			zodiac = "Tiger";
			break;
		case 7:
			zodiac = "Rabbit";
			break;
		case 8:
			zodiac = "Dragon";
			break;
		case 9:
			zodiac = "Snake";
			break;
		case 10:
			zodiac = "Horse";
			break;
		case 11:
			zodiac = "Goat";
			break;
		default:
			System.err.println("Invalid!");
			System.exit(0);
		}
		System.out.println("Your chinese zodiac animal is " + zodiac + "!");
	}
}
