package com.bilgeadam.lesson020;

public class BasicArray
{

	public static void main(String[] args)
	{
		String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		int dayOfWeek = 4;
		System.out.println("Selected day: " + weekDays[dayOfWeek - 1]);
		
		
		System.out.println("Days of week: ");
		for (int i = 0; i < weekDays.length; i++)
		{
			System.out.println("Day " + (i + 1) + " " + weekDays[i]);
		}
		
		System.out.println("Days of week reversed: ");
		for (int i = weekDays.length - 1; i >= 0; i--)
		{
			System.out.println("Day " + (i + 1) + " " + weekDays[i]);
		}
	}

}
