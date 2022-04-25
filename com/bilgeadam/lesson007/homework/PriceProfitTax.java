package com.bilgeadam.lesson007.homework;

import java.util.Scanner;

public class PriceProfitTax
{

	public static void main(String[] args)
	{
		double endPrice;
		double priceWithoutVAT;
		double rawPrice;
		double VAT;
		double profit;
		
		Scanner ask = new Scanner(System.in);

		System.out.print("Sales price of the product: ");
		endPrice = ask.nextDouble();

		System.out.print("VAT percentage: ");
		VAT = ask.nextDouble();

		System.out.print("Profit percentage: ");
		profit = ask.nextDouble();
		ask.close();

		System.out.println("Sales price: " + endPrice);

		priceWithoutVAT = (endPrice * 100) / (100 + VAT);
		System.out.println("No VAT: " + priceWithoutVAT);

		rawPrice = (priceWithoutVAT * 100) / (100 + profit);
		System.out.println("Raw price: " + rawPrice);
	}

}
