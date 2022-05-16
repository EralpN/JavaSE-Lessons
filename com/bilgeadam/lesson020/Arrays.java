package com.bilgeadam.lesson020;

import java.util.Scanner;

public class Arrays
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Number of players: ");
		int numOfPlayers = in.nextInt();
		in.nextLine();
		
		System.out.println(numOfPlayers);
		
		String[] players = new String[numOfPlayers];
		
		for (int i = 0; i < numOfPlayers; i++)
		{
			System.out.println((i + 1) + ". players name: ");
			players[i] = in.nextLine();
			
		}

		in.close();
		
		for (int i = 0; i < numOfPlayers; i++)
		{
			System.out.println((i+1) + ". players name is " + players[i]);			
		}
		
	}

}
