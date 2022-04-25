package com.bilgeadam.lesson010;

import java.util.Scanner;

public class Zodiac
{

	public static void main(String[] args)
	{

		Scanner ask = new Scanner(System.in);
		int month;
		int day;
		String zodiac = "";

		do
		{
			System.out.print("Month of birth (1:12): ");
			month = ask.nextInt();
		}
		while (!(month > 0 && month < 13));

		do
		{
			System.out.print("Day of birth (1:31): ");
			day = ask.nextInt();
		}
		while (!(day > 0 && day < 32));

		ask.close();

		if ((month == 12 && day >= 22) || (month == 1 && day <= 21))
		{
			zodiac = "Capricorn";
		}
		else if ((month == 1 && day >= 22) || (month == 2 && day <= 19))
		{
			zodiac = "Aquarius";
		}
		else if ((month == 2 && day >= 20) || (month == 3 && day <= 20))
		{
			zodiac = "Pisces";
		}
		else if ((month == 3 && day >= 21) || (month == 4 && day <= 20))
		{
			zodiac = "Aries";
		}
		else if ((month == 4 && day >= 21) || (month == 5 && day <= 21))
		{
			zodiac = "Taurus";
		}
		else if ((month == 5 && day >= 22) || (month == 6 && day <= 22))
		{
			zodiac = "Gemini";
		}
		else if ((month == 6 && day >= 23) || (month == 7 && day <= 22))
		{
			zodiac = "Cancer";
		}
		else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
		{
			zodiac = "Leo";
		}
		else if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
		{
			zodiac = "Virgo";
		}
		else if ((month == 9 && day >= 23) || (month == 10 && day <= 22))
		{
			zodiac = "Libra";
		}
		else if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
		{
			zodiac = "Scorpio";
		}
		else if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
		{
			zodiac = "Sagittarius";
		}
		else
		{
			System.out.println("Error");
			System.exit(0);
		}

		System.out.println("Your zodiac is: " + zodiac);

	}

}
