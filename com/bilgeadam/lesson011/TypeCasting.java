package com.bilgeadam.lesson011;

public class TypeCasting
{

	public static void main(String[] args)
	{
		int lowerType = 123;
		long higherType = lowerType; // lowerType can be converted to higherType

		higherType = 123_123_123_123_123L; // _ is for visibility
		lowerType = (int) higherType; // higherType can be converted to lowerType usually with problems

		System.out.println("Lower Type: " + lowerType + "\nHigher Type: " + higherType);

		// byte > short > integer > long > double > float
		
		float flt = 12.3456789f;
		double dbl = 12.3456789;
		
		double higher = flt;
		float lower = (float)dbl;
		
		System.out.println("Lower: " + lower + "\nHigher: " + higher);
		
		
	}

}
