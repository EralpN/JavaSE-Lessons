package com.bilgeadam.lesson023.homework.payroll;

public class Employee
{
	
	private String name;
	private String iD;
	
	
	public Employee(String name)
	{
		this.name = name;
		this.iD = generateID();
	}

	private static int employeeCounter;
	private String generateID()
	{
		String iD = String.format("%03d", ++employeeCounter);
		return "EMP" + iD;
	}

	public String getName()
	{
		return this.name;
	}

	public String getiD()
	{
		return this.iD;
	}
	
}
