package com.bilgeadam.lesson013;

public class Password
{

	public static void main(String[] args)
	{
		MethodPassword password = new MethodPassword();
		
		if (password.assign("", "qwerty"))
		{
			System.out.println("New password created.");
		}
		else
		{
			System.err.println("Error");
		}
		
		if (password.assign("", "Qwerty"))
		{
			System.out.println("New password created.");
		}
		else
		{
			System.err.println("Error");
		}
		

	}

}
