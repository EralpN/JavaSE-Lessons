package com.bilgeadam.lesson027;

public class StringBuilderExample
{

	public static void main(String[] args)
	{
		System.out.println("Example");
	}

	
	// this is used for long string additions
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Period: ").append("14").append(" - ");
		builder.append("Worker: ").append("John").append(" - ");
		builder.append("Pay Period: ").append("Monthly pay: ").append(" - ");
		builder.append("Earnings: ").append("5000");
		return builder.toString();
	}
}
