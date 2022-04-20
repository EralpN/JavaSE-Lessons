package com.bilgeadam.lesson008;

import java.util.Scanner;

public class SwitchUsage
{
	public static void main(String[] args)
	{
		Scanner getGrade = new Scanner(System.in);
		System.out.print("Exam grade: ");
		int grade = getGrade.nextInt();
		getGrade.close();

		int evaluatedGrade = grade / 10;

		switch (evaluatedGrade)
		{
		case 10, 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
		case 6:
			System.out.println("Grade D");
			break;
		case 5, 4, 3, 2, 1, 0:
			System.out.println("Grade F");
			break;
		default:
			System.out.println("Enter a value between 0 and 100!");
		}

	}
}
