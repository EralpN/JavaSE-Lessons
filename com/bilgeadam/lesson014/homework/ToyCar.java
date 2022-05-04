package com.bilgeadam.lesson014.homework;

public class ToyCar
{

	private final double batteryCapacity;
	private double batteryLevel;
	private int distanceTraveledEachCharge;
	private int distanceYPositive;
	private int distanceYNegative;
	private int distanceXPositive;
	private int distanceXNegative;
	// move		-1 battery
	// charge	+1 battery
	
	public ToyCar()
	{
		this.batteryCapacity = 10;
		this.batteryLevel = 10;
		this.distanceTraveledEachCharge = 1;
	}
	
	
	public void userInterface()
	{
		System.out.println("\t_____\t_____");
		System.out.println("Pwr Off\t| Q |\t| W | Up");
		System.out.println("\t_____\t_____\t_____");
		System.out.println("   Left\t| A |\t| S |\t| D | Right");
		System.out.println("\t¯¯¯¯¯\t¯¯¯¯¯\t_____");
		System.out.println("\t\t Down\t| C | Charge!");
		System.out.print("\t\t\t¯¯¯¯¯\t\tChoose your move: ");
		// W - up, A - left, S - down, D - right, C - Charge, Q - quit.
	}
	
	public void runCommand(String desicion)
	{
		switch (desicion)
		{
		case "w":
			travelUp();
			break;
		case "a":
			travelLeft();
			break;
		case "s":
			travelDown();
			break;
		case "d":
			travelRight();
			break;
		case "c":
			charge();
			break;
		case "q":
			powerOff();
			break;
		default:
			System.exit(0);
			
		}
	}
	
	
	
	private void travelUp()
	{
		if (enoughChargeToMove(this.batteryLevel))
		{
		this.distanceYPositive = this.distanceYPositive + this.distanceTraveledEachCharge;
		this.batteryLevel--;
		System.out.println("Traveled one space Up!");
		systemMessageAfterMovement();
		}
		else
		{
			System.out.println("Empty Battery!");
		}
	}
	
	private void travelDown()
	{
		if (enoughChargeToMove(this.batteryLevel))
		{
		this.distanceYNegative = this.distanceYNegative + this.distanceTraveledEachCharge;
		this.batteryLevel--;
		System.out.println("Traveled one space Down!");
		systemMessageAfterMovement();
		}
		else
		{
			System.out.println("Empty Battery!");
		}
	}
	
	private void travelRight()
	{
		if (enoughChargeToMove(this.batteryLevel))
		{
		this.distanceXPositive = this.distanceXPositive + this.distanceTraveledEachCharge;
		this.batteryLevel--;
		System.out.println("Traveled one space Right!");
		systemMessageAfterMovement();
		}
		else
		{
			System.out.println("Empty Battery!");
		}
	}

	private void travelLeft()
	{
		if (enoughChargeToMove(this.batteryLevel))
		{
		this.distanceXNegative = this.distanceXNegative + this.distanceTraveledEachCharge;
		this.batteryLevel--;
		System.out.println("Traveled one space Left!");
		systemMessageAfterMovement();
		}
		else
		{
			System.out.println("Empty Battery!");
		}
	}
	
	private void systemMessageAfterMovement()
	{
		System.out.println(displacement() + "\tBattery: " + percentageBatteryLevel(this.batteryLevel) + "%");
		lowBatteryWarning(this.batteryLevel);
	}
	
	private void charge()
	{
		if (isBatteryFull(this.batteryLevel))
		{
			System.out.println("Battery already full!");
		}
		else
		{
		this.batteryLevel = this.batteryLevel + (this.batteryCapacity * 0.3);
		if (this.batteryLevel >= this.batteryCapacity)
		{
			this.batteryLevel = this.batteryCapacity;
			System.out.println("Battery Full!");
		}
		System.out.println("Battery charged by 30%!" + "\t\tBattery: " + percentageBatteryLevel(this.batteryLevel) + "%");
		}
	}
	
	private String displacement()
	{
		int yPositive;
		int yNegative;
		if (this.distanceYPositive > this.distanceYNegative)
		{
			yPositive = distanceYPositive - distanceYNegative;
			yNegative = 0;
		}
		else if (this.distanceYPositive == this.distanceYNegative)
		{
			yPositive = 0;
			yNegative = 0;
		}
		else
		{
			yPositive = 0;
			yNegative = distanceYNegative - distanceYPositive;
		}
		int xPositive;
		int xNegative;
		if(this.distanceXPositive > this.distanceXNegative)
		{
			xPositive = distanceXPositive - distanceXNegative;
			xNegative = 0;
		}
		else if (this.distanceXPositive == this.distanceXNegative)
		{
			xPositive = 0;
			xNegative = 0;
		}
		else
		{
			xPositive = 0;
			xNegative = distanceXNegative - distanceXPositive;
		}
		String displacement = ("+X: " + xPositive + "\t+Y: " + yPositive + "\t-X: " + xNegative + "\t-Y: " + yNegative);
		return displacement;
	}
	
	private boolean isBatteryFull(double batteryLevel)
	{
		if (this.batteryLevel >= this.batteryCapacity)
		{
			return true;
		}
		return false;	
	}
	
	private boolean enoughChargeToMove(double batteryLevel)
	{
		if (batteryLevel == 0)
		{
			return false;
		}
		return true;
	}
	
	private void lowBatteryWarning(double batteryLevel)
	{
		if (!enoughChargeToMove(batteryLevel))
		{
			System.out.println("Empty battery! You must charge before you can move again!");
		}
		else if (batteryLevel <= (batteryCapacity * 0.2))
		{
			System.out.println("Low battery! Consider charging!");
		}
	}
	
	private long percentageBatteryLevel(double batteryLevel)
	{
		return Math.round((this.batteryLevel / this.batteryCapacity) * 100);
	}
	
	private void powerOff()
	{
		System.err.println("Power Off!");
		System.exit(0);
	}
	
}
