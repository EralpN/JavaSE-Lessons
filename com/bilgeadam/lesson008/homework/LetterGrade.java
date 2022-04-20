package com.bilgeadam.lesson008.homework;

import java.util.Scanner;

public class LetterGrade
{

	public static void main(String[] args)
	{
		Scanner askGrade = new Scanner(System.in);
		
		double grade;
		String letterGrade;
		
		do
		{
			System.out.print("Exam grade out of 100: ");
			grade = askGrade.nextDouble();
		}
		while (grade < 0 || grade > 100);
		
		askGrade.close();
		
		switch((grade < 50) ? "0:49" : (grade < 60) ? "50:59" : (grade < 70) ? "60:69" : (grade < 80) ? "70:79" : "80:100")
		{
		case "0:49":
			letterGrade = "FF";
			break;
		case "50:59":
			letterGrade = "DD";
			break;
		case "60:69":
			letterGrade = "CC";
			break;
		case "70:79":
			letterGrade = "BB";
			break;
		case "80:100":
			letterGrade = "AA";
			break;
		default:
			letterGrade = "Error";
		}
		
		System.out.println("Letter Grade: "+ letterGrade);

	}

}
