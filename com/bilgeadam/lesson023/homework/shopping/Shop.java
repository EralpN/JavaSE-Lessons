package com.bilgeadam.lesson023.homework.shopping;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Shop
{

	private List<Products> cart = new LinkedList<>();
	private Scanner askString = new Scanner(System.in);
	private Scanner askNumber = new Scanner(System.in);
	private boolean exit = false;

	public static void main(String[] args)
	{
		Shop shop = new Shop();

		while (shop.exit == false)
		{
			switch (shop.menu())
			{
			case 1:
				shop.showCart();
				break;
			case 2:
				shop.addToCart();
				break;
			case 3:
				shop.removeFromCart();
				break;
			case 4:
				shop.receipt();
				shop.exit = true;
				shop.askString.close();
				shop.askNumber.close();
				break;
			}
		}
		System.out.println("Bye!");
	}

	private int menu()
	{
		System.out.println();
		System.out.println("Welcome to my shop, what would you like to do?");
		System.out.println("1 - View shopping cart");
		System.out.println("2 - Add product to cart");
		System.out.println("3 - Remove last product from cart");
		System.out.println("4 - Checkout (exit)");
		int selection;
		do
		{
			selection = askNumber.nextInt();
		}
		while (!(selection > 0 && selection < 5));
		return selection;
	}

	private void showCart()
	{
		if (cart.size() != 0)
		{
			for (Products product : cart)
			{
				System.out.println(product.getProduct() + "\tX" + product.getAmount() + "\t\tPrice: " + product.getTotalPrice());
			}
		}
		else
		{
			System.out.println("No products added to cart");
		}

	}

	private void addToCart()
	{
		System.out.println();
		System.out.println("0 - Return to menu");
		System.out.println("1 - " + Product.ChipsBig + "\tPrice: " + Product.ChipsBig.getPrice() + " tl");
		System.out.println("2 - " + Product.Coke1Liter + "\tPrice: " + Product.Coke1Liter.getPrice() + " tl");
		System.out.println("3 - " + Product.Sugar1Kg + "\tPrice: " + Product.Sugar1Kg.getPrice() + " tl");
		System.out.println("4 - " + Product.Olive1Kg + "\tPrice: " + Product.Olive1Kg.getPrice() + " tl");
		System.out.println("5 - " + Product.Milk1Liter + "\tPrice: " + Product.Milk1Liter.getPrice() + " tl");
		System.out.println("6 - " + Product.BreadBig + "\tPrice: " + Product.BreadBig.getPrice() + " tl");
		System.out.println("7 - " + Product.BlackTea1Kg + "\tPrice: " + Product.BlackTea1Kg.getPrice() + " tl");
		System.out.println("8 - " + Product.EggSingle + "\tPrice: " + Product.EggSingle.getPrice() + " tl");
		System.out.println("9 - " + Product.Yoghurt1Kg + "\tPrice: " + Product.Yoghurt1Kg.getPrice() + " tl");
		System.out.println("10- " + Product.Cheese1Kg + "\tPrice: " + Product.Cheese1Kg.getPrice() + " tl");
		int selection;
		do
		{
			selection = askNumber.nextInt();
		}
		while (!(selection >= 0 && selection <= 10));

		Product product = null;
		switch (selection)
		{
		case 0:
			System.out.println("Returning...");
			break;
		case 1:
			product = Product.ChipsBig;
			break;
		case 2:
			product = Product.Coke1Liter;
			break;
		case 3:
			product = Product.Sugar1Kg;
			break;
		case 4:
			product = Product.Olive1Kg;
			break;
		case 5:
			product = Product.Milk1Liter;
			break;
		case 6:
			product = Product.BreadBig;
			break;
		case 7:
			product = Product.BlackTea1Kg;
			break;
		case 8:
			product = Product.EggSingle;
			break;
		case 9:
			product = Product.Yoghurt1Kg;
			break;
		case 10:
			product = Product.Cheese1Kg;
			break;
		}

		if (selection != 0)
		{
			int amount;
			System.out.println("Enter how many you would like to add");
			amount = askNumber.nextInt();
			cart.add(new Products(product, amount));
		}

	}

	private void removeFromCart()
	{
		if (cart.size() != 0)
		{
			System.out.println("Which product do you wish to remove?");
			System.out.println("0 - Return to menu");
			int i = 1;
			for (Products product : cart)
			{
				System.out.println(i + " - " + product.getProduct());
				i++;
			}

			int selection;
			do
			{
				selection = askNumber.nextInt();
			}
			while (!(selection >= 0 && selection <= cart.size()));

			if (selection != 0)
			{
				System.out.println(cart.remove(selection - 1).getProduct() + " has been removed");
			}
			else
			{
				System.out.println("Returning...");
			}
		}
		else
		{
			System.out.println("No products to remove");
		}
	}

	private void receipt()
	{
		double totalPrice = 0;
		if (cart.size() != 0)
		{
			for (Products product : cart)
			{
				System.out.println(product.getProduct() + "\tX" + product.getAmount() + "\t\tPrice: " + product.getTotalPrice());
				totalPrice += product.getTotalPrice();
			}
			System.out.println("Amount to be payed:\t\t" + totalPrice + " tl");
		}
		else
		{
			System.out.println("No products found");
		}

	}
}
