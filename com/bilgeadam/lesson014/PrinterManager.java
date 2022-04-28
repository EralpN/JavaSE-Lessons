package com.bilgeadam.lesson014;

import java.util.Scanner;

public class PrinterManager
{
	private Printer printer;
	
	public static void main(String[] args)
	{
		
		
		PrinterManager manager = new PrinterManager();
		
		manager.initiatePrinter();
		
		manager.printer.statusReport();
		
		manager.startPrintJob();
	
	}

	private void initiatePrinter()
	{
	
		printer = new Printer();
		printer.setPrinterName("My Printer");
		printer.setColorPrintable(true);
		printer.setBothSidesPrintable(true);
		printer.setPaperNumber(10);
		System.out.println(printer + "\n");
		
	}

	private void startPrintJob()
	{
		Scanner ask = new Scanner(System.in);
		System.out.println("How many pages will be printed?");
		int paperNumberToBePrinted = ask.nextInt();
		ask.nextLine();
		
		boolean color = false;
		if (printer.isColorPrintable())
		{
			System.out.println("Would you like to print in color? (Y/N)");
			color = ask.nextLine().equalsIgnoreCase("y");
		}
		boolean bothSide = false;
		if (printer.isBothSidesPrintable())
		{
			System.out.println("Would you like to use both sides? (Y/N)");
			bothSide = ask.nextLine().equalsIgnoreCase("y");
		}
		
		printer.startPrintJob(paperNumberToBePrinted, color, bothSide);
		ask.close();
	}

	
}
