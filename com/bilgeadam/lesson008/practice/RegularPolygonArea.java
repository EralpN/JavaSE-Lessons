package com.bilgeadam.lesson008.practice;

import java.util.Scanner;

public class RegularPolygonArea
{
	public static void main(String[] args)
	{
		double edgeNumber;
		double edgeLength;
		double area;

		Scanner ask = new Scanner(System.in);

		System.out.println("Number of edges: ");
		edgeNumber = ask.nextDouble();

		System.out.println("Length of edges: ");
		edgeLength = ask.nextDouble();

		ask.close();

		area = (edgeNumber * Math.pow(edgeLength, 2)) / (4 * Math.tan(Math.PI / edgeNumber));

		System.out.println("Area: " + area);
	}
}
