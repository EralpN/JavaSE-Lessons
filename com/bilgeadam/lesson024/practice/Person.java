package com.bilgeadam.lesson024.practice;

public class Person
{
	
	private String name;
	private String lastName;
	private String gender;
	private int age;
	
	public Person(String name, String lastName, String gender, int age)
	{
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	
	public void speak()
	{
		System.out.println("Hi my name is " + this.name);
	}


	public String getName()
	{
		return this.name;
	}


	public String getLastName()
	{
		return this.lastName;
	}


	public String getGender()
	{
		return this.gender;
	}


	public int getAge()
	{
		return this.age;
	}
}
