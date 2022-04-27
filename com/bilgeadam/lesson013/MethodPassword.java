package com.bilgeadam.lesson013;

public class MethodPassword
{

	private String password;
	
	public MethodPassword ()		//constructor method
	{
		super();					//used to call for a constructive method with the same signature that is one above in hierarchy
		
		this.password = "";			//use the password in "this" class
	}

	
	public boolean check (String password)
	{
		return password.equals(this.password);
	}
		
	
	public boolean assign (String oldPassword, String newPassword)
	{
		boolean isSuccessful = false;
		
		if (newPassword != null)
		{
			if (this.check(oldPassword) && this.checkSyntax(newPassword))
			{
			isSuccessful = true;
			this.password = newPassword;
			}
		}
		return isSuccessful;
	}
	
	
	private boolean checkSyntax (String password)
	{
		
		//Password must start with a capital letter
		
		boolean isCorrect = false;
		char first = password.toLowerCase().charAt(0);
		isCorrect = (first != password.charAt(0));
		return isCorrect;
		
	}
}
