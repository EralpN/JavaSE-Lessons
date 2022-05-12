package com.bilgeadam.lesson019.model.People;

public enum EmployeePosition
{
	CASHIER("Cashier"), CLERK("Clerk"), MANAGER("Manager");
	
	private String name;
	
	EmployeePosition(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
}
