package com.bilgeadam.lesson027.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class YourBirthDay
{

	public static void main(String[] args)
	{
		Scanner askNumber = new Scanner(System.in);
		
		System.out.print("Month of birth (1 - 12): ");
		int month = askNumber.nextInt();
		
		System.out.print("Day of birth (1 - 31): ");
		int day = askNumber.nextInt();
		
		System.out.print("Year of birth (1970 - 2022): ");
		int year = askNumber.nextInt();
		
		askNumber.close();
		
		LocalDate birthDate = LocalDate.of(year, month, day);
		
		System.out.println("Birth date: " + birthDate.toString());
		
		System.out.println("Day of birth: " + birthDate.getDayOfWeek());
		
		System.out.println("Age: " + (LocalDate.now().getYear() - birthDate.getYear()));
		
		System.out.println("Days alive: " + birthDate.until(LocalDate.now(), ChronoUnit.DAYS));
		
		LocalDate nextBirthDate = null;
		long yearsInBetween = birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
		nextBirthDate = birthDate.plusYears(yearsInBetween + 1);
		System.out.println("Next birthday: " + nextBirthDate.toString());
		
//		int yearNow = LocalDate.now().getYear();
//		if (birthDate.getMonthValue() > LocalDate.now().getMonthValue())
//		{
//			nextBirthDate = LocalDate.of(yearNow, month, day);
//			System.out.println("Next birthday: " + nextBirthDate.toString());
//		}
//		else if (birthDate.getMonthValue() == LocalDate.now().getMonthValue())
//		{
//			if (birthDate.getDayOfMonth() > LocalDate.now().getDayOfMonth())
//			{
//				nextBirthDate = LocalDate.of(yearNow, month, day);
//				System.out.println("Next birthday: " + nextBirthDate.toString());
//			}
//			else if (birthDate.getDayOfMonth() == LocalDate.now().getDayOfMonth())
//			{
//				System.out.println("Your birthday is today! Happy birthday!");
//				nextBirthDate = LocalDate.of(yearNow + 1, month, day);
//				System.out.println("Next birthday: " + nextBirthDate.toString());
//			}
//			else
//			{
//				nextBirthDate = LocalDate.of(yearNow + 1, month, day);
//				System.out.println("Next birthday: " + nextBirthDate.toString());
//			}
//		}
//		else
//		{
//			nextBirthDate = LocalDate.of(yearNow + 1, month, day);
//			System.out.println("Next birthday: " + nextBirthDate.toString());
//		}
		
		
		System.out.println("Days until next birthday: " + (LocalDate.now().until(nextBirthDate, ChronoUnit.DAYS)));
	
		System.out.println("6 months after next birthday: " + nextBirthDate.plusMonths(6).toString());
		
		
	}

}
