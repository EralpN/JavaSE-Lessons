package com.bilgeadam.lesson008.practice;

import java.util.Scanner;

public class TriangleMissingEdge
{

	public static void main(String[] args)
	{
		double edgeA;
		double edgeB;
		double edgeC;
		double degreeA;
		double degreeB;
		double degreeC;
		double degreeRadC;
		
		Scanner ask = new Scanner(System.in);

		System.out.print("Edge A: ");
		edgeA = ask.nextDouble();

		System.out.print("Degree A: ");
		degreeA = ask.nextDouble();

		System.out.print("Edge B: ");
		edgeB = ask.nextDouble();

		System.out.print("Degree B: ");
		degreeB = ask.nextDouble();

		ask.close();

		degreeC = ((180 - degreeA) - degreeB);
		degreeRadC = Math.toRadians(degreeC);
		edgeC = Math.sqrt(Math.pow(edgeA, 2) + Math.pow(edgeB, 2) - (2 * edgeA * edgeB * Math.cos(degreeRadC)));

		System.out.println("Edge C: " + edgeC + "\nDegree C: " + degreeC);
	}

}
