package com.bilgeadam.lesson020.superpractice;

public class Magazine extends Book
{
	private int issueNumber;

	
	public Magazine(String name, double price, String author, int year, int issueNumber)
	{
		super(name, price, author, year);
		this.issueNumber = issueNumber;
	}


	public int getIssueNumber()
	{
		return this.issueNumber;
	}


	@Override
	public String toString()
	{
		return "Magazine [issueNumber=" + this.issueNumber + ", toString()=" + super.toString() + "]";
	}

	


}
