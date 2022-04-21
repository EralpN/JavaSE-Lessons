package com.bilgeadam.lesson009.practice;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame
{
	public static void main(String[] args)
	{
		// generates a number between 0 and given number
		Random rndm = new Random();
		int randomNumber = rndm.nextInt(101);

		System.out.println("Can you guess my random number between 0 and 100 in 10 tries? ");

		Scanner ask = new Scanner(System.in);

		int guess;
		int i = 0;

		do
		{
			i++;
			if (i > 10)
			{
				break;
			}
//			i++;
			System.out.print("Guess: ");
			guess = ask.nextInt();
			if (guess > randomNumber && i < 10)
			{
				System.out.println(10 - i + " tries remaining, Guess lower than " + guess + "!");
			}
			if (guess < randomNumber && i < 10)
			{
				System.out.println(10 - i + " tries remaining, Guess higher than " + guess + "!");
			}
		}
		while (guess != randomNumber);

		ask.close();

		if (i <= 10)
		{
			System.out.println("Congragulations you found the number " + randomNumber + " in " + i + " tries!");
		}
		else
		{
			System.out.println(11 - i + " tries remaning, You lost the number was " + randomNumber + "!");
		}

	}
}
