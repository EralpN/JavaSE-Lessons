package com.bilgeadam.lesson011;

public class BoxingUnboxing
{

	public static void main(String[] args)
	{

		int primitiveNumber = 5;
		// primitiveNumber. no methods appear
		Integer complexNumber = primitiveNumber; // boxing
		// complexNumber. methods appear
		System.out.println(complexNumber);

		
		
		
		Boolean isTrue = null;
		if (isTrue == null)
		{
			isTrue = false; // unboxing and uses as primitive boolean
		}
		if (isTrue)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
