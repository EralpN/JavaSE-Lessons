package com.bilgeadam.lesson008;

import java.util.Scanner;

public class SwitchUsageAlternative
{
	public static void main(String[] args)
	{
		Scanner getGrade = new Scanner(System.in);
		System.out.print("Exam grade: ");
		int grade = getGrade.nextInt();
		getGrade.close();

		int evaluatedGrade = grade / 10;

		String gradeCode = switch (evaluatedGrade)
		{
		case 10, 9:
			yield "Grade A";
		case 8:
			yield "Grade B";
		case 7:
			yield "Grade C";
		case 6:
			yield "Grade D";
		case 5, 4, 3, 2, 1, 0:
			yield "Grade F";
		default:
			yield "Enter a value between 0 and 100!";
		};
		System.out.println(gradeCode);
	}
}
