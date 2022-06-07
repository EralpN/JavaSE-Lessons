package com.bilgeadam.lesson035.builder;

public class MustHaveProperty
{
	private String property1;
	private String property2;
	private String property3;
	private String property4;
	private String property5;

	public MustHaveProperty(String property1, String property2, String property3, String property4, String property5)
	{
		super();
		this.property1 = property1;
		this.property2 = property2;
		this.property3 = property3;
		this.property4 = property4;
		this.property5 = property5;
	}

	public String getProperty1()
	{
		return this.property1;
	}

	public void setProperty1(String property1)
	{
		this.property1 = property1;
	}

	public String getProperty2()
	{
		return this.property2;
	}

	public void setProperty2(String property2)
	{
		this.property2 = property2;
	}

	public String getProperty3()
	{
		return this.property3;
	}

	public void setProperty3(String property3)
	{
		this.property3 = property3;
	}

	public String getProperty4()
	{
		return this.property4;
	}

	public void setProperty4(String property4)
	{
		this.property4 = property4;
	}

	public String getProperty5()
	{
		return this.property5;
	}

	public void setProperty5(String property5)
	{
		this.property5 = property5;
	}

	@Override
	public String toString()
	{
		return "MustHaveProperty [property1=" + this.property1 + ", property2=" + this.property2 + ", property3="
				+ this.property3 + ", property4=" + this.property4 + ", property5=" + this.property5 + "]";
	}


}
