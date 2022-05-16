package com.bilgeadam.lesson020.homework;

public class Student implements IDGeneratable
{
	
	private String name;
	private String idNumber;
	private String courseTaken;
	private Address address;
	
	
	public Student(String name, String courseTaken, Address address)
	{
		this.name = name;
		this.idNumber = generateID();
		this.courseTaken = courseTaken;
		this.address = address;
	}

	
	private int studentCounter;
	@Override
	public String generateID()
	{
		String studentNumber = String.format("%03d", ++studentCounter);
		return "STDNT" + studentNumber;
	}
	
	
	
	
	public String getName()
	{
		return this.name;
	}
	public String getIdNumber()
	{
		return this.idNumber;
	}
	public String getCourseTaken()
	{
		return this.courseTaken;
	}
	public Address getAddress()
	{
		return this.address;
	}


}
