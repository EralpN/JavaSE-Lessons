package com.bilgeadam.lesson028;

import java.time.LocalDate;

public class FurnitureShop
{

	public static void main(String[] args)
	{
		Furniture table = new Table(FurnitureSet.LIVING_ROOM, Material.WOOD, LocalDate.of(2021, 6, 17));
		Furniture stool = new Stool(FurnitureSet.GARDEN, Material.WOOD, LocalDate.of(2022, 1, 12));
		Furniture chair = new Chair(FurnitureSet.KIDS, Material.PLASTIC, LocalDate.of(2022, 4, 22));
		
		
		System.out.println("Table properties: ");
		System.out.println(table.getSetName());
		System.out.println(table.getMaterialName());
		table.getSet().isWaterResistant();
		table.getMaterial().maintnanceDate(table.getPurchaseDate());
		
		System.out.println();
		
		System.out.println("Stool properties: ");
		System.out.println(stool.getSetName());
		System.out.println(stool.getMaterialName());
		stool.getSet().isWaterResistant();
		stool.getMaterial().maintnanceDate(stool.getPurchaseDate());
		
		System.out.println();
		
		System.out.println("Chair properties: ");
		System.out.println(chair.getSetName());
		System.out.println(chair.getMaterialName());
		chair.getSet().isWaterResistant();
		chair.getMaterial().maintnanceDate(chair.getPurchaseDate());
		
	}

}
