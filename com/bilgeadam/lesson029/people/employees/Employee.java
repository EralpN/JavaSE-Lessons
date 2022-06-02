package com.bilgeadam.lesson029.people.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.bilgeadam.lesson029.people.Gender;
import com.bilgeadam.lesson029.people.Name;
import com.bilgeadam.lesson029.people.Person;
import com.bilgeadam.lesson029.people.Profession;

public abstract class Employee extends Person
{

	private static int employeeCounter = 0;
	private Profession profession;
	private boolean isMarried;
	private LocalDate workStart;
	private LocalDate workEnd;
	private double startSalary;
	private String phoneNumber;
	
	// Still working as an employee.
	public Employee(Name name, Gender gender, LocalDate birthDate, boolean isMarried, LocalDate workStart, double startSalary, String phoneNumber)
	{
		super(name, gender, birthDate);
		this.isMarried = isMarried;
		this.workStart = workStart;
		this.workEnd = null;
		this.startSalary = startSalary;
		this.phoneNumber = phoneNumber;
	}
	
	// Left work, (quit).
	public Employee(Name name, Gender gender, LocalDate birthDate, boolean isMarried, LocalDate workStart,
			LocalDate workEnd, double startSalary, String phoneNumber)
	{
		super(name, gender, birthDate);
		this.isMarried = isMarried;
		this.workStart = workStart;
		this.workEnd = workEnd;
		this.startSalary = startSalary;
		this.phoneNumber = phoneNumber;
	}
	
	// abstract methods
	public abstract String generateID();
	public abstract String getEmployeeID();
	
	// calculates current salary an employee takes.
	// if the employee quit in the past shows latest salary taken
	public double getLatestSalary()
	{
		if (this.getWorkEnd() == null)
		{
			int period = ((int) this.getWorkStart().until(LocalDate.now(), ChronoUnit.MONTHS)) / 6;
			return getStartSalary() * Math.pow(getInterest(), period);
		}
		else
		{
			int period = ((int) this.getWorkStart().until(getWorkEnd(), ChronoUnit.MONTHS)) / 6;
			return getStartSalary() * Math.pow(getInterest(), period);
		}
	}
	
	// Changes married status and changes last name
	public void changeMarriedDivorced(String newLastName)
	{
		if (getGender().equals(Gender.FEMALE))
		{
			changeLastName(newLastName);
		}
		this.isMarried = !this.isMarried;
	}
	
	// Changes last name
	private void changeLastName(String lastName)
	{
		getNameObject().setLastName(lastName);
	}
	
	public String getProfession()
	{
		return this.profession.getProfessionString();
	}
	
	public double getInterest()
	{
		return this.profession.getInterest();
	}

	public boolean isMarried()
	{
		return this.isMarried;
	}

	public LocalDate getWorkStart()
	{
		return this.workStart;
	}

	public LocalDate getWorkEnd()
	{
		return this.workEnd;
	}

	public double getStartSalary()
	{
		return this.startSalary;
	}

	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}

	public void setProfession(Profession profession)
	{
		this.profession = profession;
	}

	public static int getEmployeeCounter()
	{
		return employeeCounter;
	}

	public static void setEmployeeCounter(int employeeCounter)
	{
		Employee.employeeCounter = employeeCounter;
	}
}
