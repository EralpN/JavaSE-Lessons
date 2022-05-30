package com.bilgeadam.lesson029.people;

import java.time.LocalDate;

public abstract class Person
{
	private Name name;
	private Gender gender;
	private LocalDate birthDate;
	
	public Person(Name name, Gender gender, LocalDate birthDate)
	{
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public Name getNameObject()
	{
		return this.name;
	}
	
	public String getName()
	{
		if (this.name.getMiddleName().equals(""))
		{
			return this.name.getFirstName() + " " + this.name.getLastName();	
		}
		else
		{
			return this.name.getFirstName() + " " + this.name.getMiddleName() + " " + this.name.getLastName();	
		}
	}
	
	public Gender getGender()
	{
		return this.gender;
	}

	public LocalDate getBirthDate()
	{
		return this.birthDate;
	}
	
}
