package com.bilgeadam.lesson010;

import java.util.Scanner;

public class RegisterLogin
{

	public static void main(String[] args)
	{

		String adminUsername = "admin";
		String adminPassword = "admin";
		String username = adminUsername;
		String password = adminPassword;
		String askUsername;
		String tempPassword;
		String askPassword;

		int yesNo = 0;
		int yesNo2 = 0;
		int yesNo3 = 0;

		Scanner yn = new Scanner(System.in);
		Scanner usr = new Scanner(System.in);
		Scanner pass = new Scanner(System.in);

		do
		{
			System.out.print("Welcome to my landing page, do you have an account? \nPress 1 for yes and 2 for no: ");
			yesNo = yn.nextInt();
		}
		while (!(yesNo == 1 || yesNo == 2));

		register: while (true)
		{

			if (yesNo == 2)
			{
				System.out.print("Please choose a username for your account: ");
				username = usr.next();

				System.out.print("Please choose a password for your account: ");
				password = pass.next();
			}

			while (true)
			{
				System.out.print("Please login using your account data \nUsername: ");

				askUsername = usr.next();
				if (askUsername.equals(adminUsername))
				{
					tempPassword = adminPassword;
					break;
				}

				if (askUsername.equals(username))
				{
					tempPassword = password;
					break;
				}

				do
				{
					System.out.print("No such user in database. Would you like to try again? \n1 yes, 2 new account: ");
					yesNo2 = yn.nextInt();
				}
				while (!(yesNo2 == 1 || yesNo2 == 2));

				if (yesNo2 == 1)
				{
					yesNo2 = 0;
					continue;
				}
				else
				{
					yesNo2 = 0;
					continue register;
				}
			}
			while (true)
			{
				System.out.print("Please enter your account pasword \nPassword: ");
				askPassword = pass.next();

				if (askPassword.equals(tempPassword))
				{
					System.out.println("Welcome! You Did It!");
					yn.close();
					usr.close();
					pass.close();
					System.exit(0);
				}

				System.out.print("Wrong password. Would you like to try again? \n1 yes, 2 new account: ");

				do
				{
					yesNo3 = yn.nextInt();
				}
				while (!(yesNo3 == 1 || yesNo3 == 2));

				if (yesNo3 == 1)
				{
					yesNo3 = 0;
					continue;
				}

				else
				{
					yesNo3 = 0;
					continue register;
				}

			}

		}

	}

}
