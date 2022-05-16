package com.bilgeadam.lesson020;

public class BoredMan
{

	public static void main(String[] args)
	{
		int lockerNumber = 10;
		int tourNumber = 10;
		
		boolean[] lockers = new boolean[lockerNumber];
		
		for (int i = 0; i < lockerNumber; i++)
		{
			lockers[i] = false;
		}
		
		for (int increaseInNum = 1; increaseInNum <= tourNumber; increaseInNum++)
		{
			for (int i = 0; i < lockerNumber; i += increaseInNum)
			{
				lockers[i] = !lockers[i];
			}
		}
		
		for (int i = 0; i < lockerNumber; i++)
		{
			System.out.println("Locker number " + (i + 1) + ": " + lockers[i]);
		}
	}

}
