package com.bilgeadam.lesson019.model.People;

import java.time.LocalDate;

public class Employee extends Person
{

	private double salary;
	private LocalDate startDate;
	private EmployeePosition position;
	
	private int employeeCounter;
	
	public Employee(String name, LocalDate birthDate, double salary, LocalDate startDate, EmployeePosition position)
	{
		super(name, birthDate);
		this.salary = salary;
		this.startDate = startDate;
		this.position = position;
	}

	@Override
	protected String generateID()
	{
		String num = String.format("%03d", ++employeeCounter);
		return "EMP-" + num;
	}

	@Override
	public String toString()
	{
		return "Employee [salary=" + this.salary + ", startDate=" + this.startDate + ", position=" + this.position.getName()
				+ ", idNumber=" + this.idNumber + ", toString()=" + super.toString() + "]";
	}


	
	


	
	
}
