package com.bilgeadam.lesson029.people.employees;

import java.time.LocalDate;

import com.bilgeadam.lesson029.people.Gender;
import com.bilgeadam.lesson029.people.Name;
import com.bilgeadam.lesson029.people.Profession;

public class Teacher extends Employee
{

	private String employeeID;
	
	public Teacher(Name name, Gender gender, LocalDate birthDate, boolean isMarried,
			LocalDate workStart, double startSalary, String phoneNumber)
	{
		super(name, gender, birthDate, isMarried, workStart, startSalary, phoneNumber);
		this.setProfession(Profession.TEACHER);
		this.employeeID = generateID();
	}

	public Teacher(Name name, Gender gender, LocalDate birthDate, boolean isMarried,
			LocalDate workStart, LocalDate workEnd, double startSalary, String phoneNumber)
	{
		super(name, gender, birthDate, isMarried, workStart, workEnd, startSalary, phoneNumber);
		this.setProfession(Profession.TEACHER);
		this.employeeID = generateID();
	}
	
	@Override
	public String generateID()
	{
		String prof = "TCH-";
		String idnum = String.format("%03d", (getEmployeeCounter() + 1));
		setEmployeeCounter(getEmployeeCounter() + 1);
		return prof + idnum;
	}
	
	public String getEmployeeID()
	{
		return employeeID;
	}
}
