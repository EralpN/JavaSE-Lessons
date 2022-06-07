package com.bilgeadam.lesson035.builder;

public class BuilderTest
{
	
	public static void main(String[] args)
	{
		ObjectToBeBuilt object = new ObjectToBeBuilt.ObjectBuilder
				("1st must have", "2nd must have", "3rd must have", 
				new MustHaveProperty("1st  property", "2nd property", "3nd property", "4nd property", "5th property"))
				.optional1("1st optional")
				.optional2("2nd optional")
				.optional3("3rd optional")
				.build();
		System.out.println(object);
	}

}
