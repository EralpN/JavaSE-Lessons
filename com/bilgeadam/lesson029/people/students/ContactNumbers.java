package com.bilgeadam.lesson029.people.students;

public class ContactNumbers
{
	private String mobile;
	private String home;
	private String guardian;
	
	public ContactNumbers(String mobile, String home, String guardian)
	{
		this.mobile = mobile;
		this.home = home;
		this.guardian = guardian;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public void setHome(String home)
	{
		this.home = home;
	}

	public void setGuardian(String guardian)
	{
		this.guardian = guardian;
	}

	public String getMobile()
	{
		return this.mobile;
	}

	public String getHome()
	{
		return this.home;
	}

	public String getGuardian()
	{
		return this.guardian;
	}
	
	
}
