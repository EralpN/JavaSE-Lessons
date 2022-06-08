package com.bilgeadam.lesson036.prototyping;

public class ClassToClone implements Prototype
{

	private String property1;
	private String property2;
	private String property3;
	
	
	
	public ClassToClone(String property1, String property2, String property3)
	{
		super();
		this.property1 = property1;
		this.property2 = property2;
		this.property3 = property3;
	}



	
	@Override
	public Prototype getClone()
	{
		return new ClassToClone(this.property1, this.property2, this.property3);
	}




	public void showString()
	{
		System.out.println("ClassToClone [property1=" + this.property1 + ", property2=" + this.property2 + ", property3="
				+ this.property3 + "]");
	}

}
