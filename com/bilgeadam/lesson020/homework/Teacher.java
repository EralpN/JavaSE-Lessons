package com.bilgeadam.lesson020.homework;

public class Teacher implements IDGeneratable
{

	private String name;
	private String idNumber;
	private String branch;
	private Address address;
	
	public Teacher(String name, String branch, Address address)
	{
		this.name = name;
		this.idNumber = generateID();
		this.branch = branch;
		this.address = address;
	}

	
	private int teacherCounter;
	@Override
	public String generateID()
	{
		String teacherNumber = String.format("%04d", ++teacherCounter);
		return "TCHR" + teacherNumber;
	}
	
	
	
	public String getName()
	{
		return this.name;
	}
	public String getIdNumber()
	{
		return this.idNumber;
	}
	public String getBranch()
	{
		return this.branch;
	}
	public Address getAddress()
	{
		return this.address;
	}

}
