package com.bilgeadam.lesson014;

public class Printer
{
	private static final double CRITICAL_TONER_LEVEL = 0.10d;
	private static final double TONER_USAGE_PER_PAGE = 0.01d;

	private String printerName;
	private double tonerLevel;
	private int printedBWPages;
	private int printedColorPages;
	private boolean bothSidesPrintable;
	private boolean colorPrintable;
	private int paperNumber;

	public Printer()
	{
		this.tonerLevel = 100.0;
		this.printedBWPages = 0;
		this.printedColorPages = 0;
		this.paperNumber = 0;
	}
	
	
	public void startPrintJob(int paperNumberToBePrinted, boolean color, boolean bothSide)
	{
		if(!isTonerLevelSufficient())
		{
			this.setTonerLevel(100.0);
		}
		int printedPaper = 0;
		while (printedPaper < paperNumberToBePrinted)
		{
			if (!isPaperAvailable())
			{
				this.setPaperNumber(50);
				System.err.println("Not enough paper in printer filling 50 papers");
			}
			printedPaper = printPage(printedPaper, color, bothSide);

		}
		
		endPrintJob();
	}
	
	private int printPage(int printedPaper, boolean color, boolean bothSide)
	{
		printedPaper++;
		System.out.println(printedPaper + " paper printed.");
		if (bothSide)
		{
			this.tonerLevel = this.tonerLevel - Printer.TONER_USAGE_PER_PAGE * 2;
			if (color)
			{
				printedColorPages++;
			}
			else
			{
				printedBWPages++;
			}
			this.paperNumber--;
		}
		else
		{
			this.tonerLevel = this.tonerLevel - Printer.TONER_USAGE_PER_PAGE;
			if (color)
			{
				printedColorPages++;
			}
			else
			{
				printedBWPages++;
			}
			this.paperNumber--;
		}
		
		return printedPaper;
	}
	
	
	
	private boolean isPaperAvailable()
	{
		return this.paperNumber > 0;
	}
	
	private void endPrintJob()
	{
		System.out.println("Print Successful!");
		this.statusReport();
		
	}


	private boolean isTonerLevelSufficient()
	{
		return this.tonerLevel >= CRITICAL_TONER_LEVEL;
	}
	
	
	

	public void setPrinterName(String printerName)
	{
		this.printerName = printerName;
	}

	public void setTonerLevel(double tonerLevel)
	{
		if (tonerLevel > 100)
		{
			tonerLevel = 100;
		}
		this.tonerLevel = tonerLevel;
	}

	public void setBothSidesPrintable(boolean bothSidesPrintable)
	{
		this.bothSidesPrintable = bothSidesPrintable;
	}

	public boolean isBothSidesPrintable()
	{
		return bothSidesPrintable;
	}

	public void setColorPrintable(boolean colorPrintable)
	{
		this.colorPrintable = colorPrintable;
	}

	public boolean isColorPrintable()
	{
		return colorPrintable;
	}

	public void setPaperNumber(int paperNumber)
	{
		this.paperNumber = paperNumber;
	}

	public void statusReport()
	{
		System.out.println("Printer Name:\t\t" + this.printerName);
		System.out.println("Printed B/W Pages:\t" + this.printedBWPages);
		System.out.println("Printed Color Pages:\t" + this.printedColorPages);
		System.out.println("Printed Total Pages:\t" + (this.printedColorPages + this.printedBWPages));
	}

	@Override
	public String toString()
	{
		return "Printer [printerName=" + printerName + ", tonerLevel=" + tonerLevel + ", printedBWPages="
				+ printedBWPages + ", printedColorPages=" + printedColorPages + ", bothSidesPrintable="
				+ bothSidesPrintable + ", colorPrintable=" + colorPrintable + ", paperNumber=" + paperNumber + "]";
	}

}
