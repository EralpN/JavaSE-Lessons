package com.bilgeadam.lesson027;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int id;
	LocalDate birthDate;

	public Student(String name, int id, LocalDate birthDate)
	{
		this.name = name;
		this.id = id;
		this.birthDate = birthDate;
	}

	public String getName()
	{
		return this.name;
	}

	public int getId()
	{
		return this.id;
	}

	public LocalDate getBirthDate()
	{
		return this.birthDate;
	}

	@Override
	public String toString()
	{
		return "Student [name=" + this.name + ", id=" + this.id + ", birthDate=" + this.birthDate + "]";
	}

}
