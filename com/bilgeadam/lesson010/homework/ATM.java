package com.bilgeadam.lesson010.homework;

import java.util.Scanner;

public class ATM
{
// Username: user
// Password: 123
	public static void main(String[] args)
	{
		System.out.println("Card has been inserted please enter your account info.");

		String username = "user", password = "123", usernameTemp, passwordTemp;

		Scanner ask = new Scanner(System.in);

		System.out.print("Username: ");
		usernameTemp = ask.next();

		while (!usernameTemp.equals(username))
		{
			System.out.print("No Such User Please Enter Again: ");
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

		int balance = 1500;

		while (true)
		{
			Scanner menu = new Scanner(System.in);
			System.out.println("What would you like to do? (1/2/3)" + "\nBalance: " + balance + "\n1: Deposit \n2: Withraw \n3: Exit");
			int option = 3, attempt;

			while (menu.hasNext())
			{
				if (menu.hasNextInt())
				{
					option = menu.nextInt();
				}
				else
				{
					System.out.print("Please select one of the given options: ");
					menu.next();
					continue;
				}
				if (!(option > 0 && option < 4))
				{
					System.out.print("Please select one of the given options: ");
					continue;
				}
				break;
			}

			switch (option)
			{
			case 1:
				Scanner dep = new Scanner(System.in);
				do
				{
					System.out.print("Enter the deposit amount: ");
					attempt = dep.nextInt();
					if (attempt < 0)
					{
						System.out.println("Enter a valid amount!");
					}
				}
				while (attempt < 0);
				balance = balance + attempt;
				System.out.println(attempt + " has been deposited to your account");
				break;
			case 2:
				Scanner wit = new Scanner(System.in);
				do
				{
					do
					{
						System.out.print("Enter the withraw amount: ");
						attempt = wit.nextInt();
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
				break;
			case 3:
				System.out.print("Thank you for using our service! \nHave a nice day!");
				ask.close();
				menu.close();
				System.exit(0);
			default:
				System.out.print("Error!");
				ask.close();
				menu.close();
				System.exit(0);
			}

		}

	}

}
