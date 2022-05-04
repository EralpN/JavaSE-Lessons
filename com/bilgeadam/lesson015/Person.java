package com.bilgeadam.lesson015;

public class Person
{
	private String name;
	private String lastName;
	private String gender;
	private int age;
	
	public Person()
	{
		
	}

	public void showID()
	{
		System.out.println(name + " " + lastName);
		System.out.println("Age: " + age);
		System.out.println(gender + "\n");
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
