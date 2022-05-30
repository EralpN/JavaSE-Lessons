package com.bilgeadam.lesson025;

public class LambdaExample
{

	public static void main(String[] args)
	{
		LambdaExampleFunctionalInterface lambda = (a, b) ->
		{
			System.out.println(a + " + " + b);
			return a + b;
		};

		System.out.println(lambda.process(3, 5));
	}

}
