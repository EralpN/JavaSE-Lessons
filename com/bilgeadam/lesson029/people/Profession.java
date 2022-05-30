package com.bilgeadam.lesson029.people;

public enum Profession
{
	// second parameter is the interest rate of salary!
	
	TEACHER("Teacher", 1.1), 
	CLERK("Clerk", 1.09), 
	SERVANT("Servant", 1.085);

	String profession;
	double interest;

	private Profession(String profession, double interest)
	{
		this.profession = profession;
		this.interest = interest;
	}

	public String getProfessionString()
	{
		return this.profession;
	}

	public double getInterest()
	{
		return this.interest;
	}
}
