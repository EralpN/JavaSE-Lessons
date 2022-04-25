package com.bilgeadam.lesson008.homework;

import java.util.Scanner;

public class LetterGrade
{

	public static void main(String[] args)
	{
		Scanner askGrade = new Scanner(System.in);
		
		double grade;
		double midterm1;
		double midterm2;
		double finalExam;
		
		String letterGrade;
		
		do
		{
			System.out.print("First midterm grade out of 100: ");
			midterm1 = askGrade.nextDouble();
		}
		while (midterm1 < 0 || midterm1 > 100);
		
		do
		{
			System.out.print("Second midterm grade out of 100: ");
			midterm2 = askGrade.nextDouble();
		}
		while (midterm2 < 0 || midterm2 > 100);
		
		do
		{
			System.out.print("Final exam grade out of 100: ");
			finalExam = askGrade.nextDouble();
		}
		while (finalExam < 0 || finalExam > 100);
		
		askGrade.close();
		
		grade = (0.2 * midterm1) + (0.2 * midterm2) + (0.6 * finalExam);
		
		
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
