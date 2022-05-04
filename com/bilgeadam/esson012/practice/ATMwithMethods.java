package com.bilgeadam.esson012.practice;

import java.util.Scanner;

public class ATMwithMethods
{
	
	
//	Username: user
//	Password: 123
	
	static String username = "user"; 
	static String password = "123"; 
	
	
	
	
	static int balance = 1500;
	static Scanner menuAsk = new Scanner(System.in);
	static Scanner withrawAsk = new Scanner(System.in);
	static Scanner depositAsk = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		login();

		while (true)
		{
			int option = menuKey();

			switch (option)
			{
			case 1:
				deposit();
				break;
			case 2:
				withraw();
				break;
			case 3:
				exit();
			default:
				System.err.print("Error!");
				System.exit(0);
			}

		}

	}
	
	
// This line is where the methods start. This is done to keep main method clean.
	
	private static void login()
	{
		System.out.println("Card has been inserted please enter your account info.");

		String usernameTemp; 
		String passwordTemp;

		Scanner ask = new Scanner(System.in);

		System.out.print("Username: ");
		usernameTemp = ask.next();

		while (!usernameTemp.equals(username))
		{
			System.out.print("User does not match the inserted card. \nPlease Enter Again: ");
			usernameTemp = ask.next();
		}

		System.out.print("Password: ");
		passwordTemp = ask.next();

		int i = 1;
		while (!passwordTemp.equals(password))
		{
			if (i == 3)
			{
				System.err.print("Card Has Been Blocked! \nToo many wrong attempts!");
				ask.close();
				System.exit(0);
			}
			System.out.print("Wrong Password " + (3 - i) + " Attempts Remaining: ");
			passwordTemp = ask.next();
			i++;
		}
	}
	
	
	
	private static int menuKey()
	{
		
		System.out.println("\nWhat would you like to do? (1/2/3)" + "\nBalance: " + balance + "\n1: Deposit \n2: Withraw \n3: Exit");
		int option = 3;

		while (menuAsk.hasNext())
		{
			if (menuAsk.hasNextInt())
			{
				option = menuAsk.nextInt();
			}
			else
			{
				System.out.print("Please select one of the given options: ");
				menuAsk.next();
				continue;
			}
			if (!(option > 0 && option < 4))
			{
				System.out.print("Please select one of the given options: ");
				continue;
			}
			break;
		}
		return option;
	}
	
	
	
	
	
	
	
	private static void withraw()
	{
		int attempt;
		
		do
		{
			do
			{
				System.out.print("Enter the withraw amount: ");
				attempt = withrawAsk.nextInt();
				if (attempt > balance)
				{
					System.out.println("Not enough funds!");
				}
				if (attempt < 0)
				{
					System.out.println("Enter a valid amount!");
				}
			}
			while (attempt > balance);
		}
		while (attempt < 0);
		balance = balance - attempt;
		System.out.println(attempt + " has been withrawn from your account");
	}
	
	
	
	
	
	private static void deposit()
	{
		int attempt;
		
		do
		{
			System.out.print("Enter the deposit amount: ");
			attempt = depositAsk.nextInt();
			if (attempt < 0)
			{
				System.out.println("Enter a valid amount!");
			}
		}
		while (attempt < 0);
		balance = balance + attempt;
		System.out.println(attempt + " has been deposited to your account");
	}
	
	
	
	
	
	
	private static void exit()
	{
		menuAsk.close();
		withrawAsk.close();
		depositAsk.close();
		System.out.print("Thank you for using our service! \nHave a nice day!");
		System.exit(0);
	}
}
