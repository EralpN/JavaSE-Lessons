package com.bilgeadam.lesson028.recursive;

public class Pyramid
{
	private static String symbol = "#";
	
	public static void main(String[] args)
	{
		int height = 10;
		
		System.out.println(drawPyramid(height));
	}

	
	
	private static String drawPyramid(int height)
	{
		return height == 0 ? "" : drawSymbol(height) + "\n" + drawPyramid(height - 1);
	}
	
	
	private static String drawSymbol(int height)
	{
		return height == 0 ? "" : symbol + drawSymbol(height - 1);
	}
	
}
