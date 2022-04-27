package com.bilgeadam.lesson013;

public class Person
{
	// class variable
	private static int numberOfPeople = 5;
	
	// instance variables
	private String firstName;
	private String lastName;
	private int age;
	
	public static void main(String[] args)
	{
		Person person = new Person();
		person.age = 26;
		person.firstName = "Eralp";
		person.lastName = "Nitelik";
		
		// local variable
		int daysLived = person.age * 365;
		
		System.out.println("Out of " + numberOfPeople + " people,\n" + person.getFullName() + " at the age of " + person.age + " has lived for " + daysLived + " days.");
		System.out.println(person.toString());
	}
	
	
	
	private String getFullName()
	{
		// local variable
		String fullName = this.firstName + " " + this.lastName;
		return fullName;
	}


	@Override
	public String toString()
	{
		return "Person [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + "]";
	}
}
