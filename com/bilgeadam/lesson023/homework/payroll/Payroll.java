package com.bilgeadam.lesson023.homework.payroll;

import java.time.Period;

public class Payroll extends Accounting
{
	
	private double salary;
	
	public Payroll(Period period, Employee employee, double salary)
	{
		super(period, employee);
		this.salary = salary;
	}
	
	public double getMonthlyIncome()
	{
		return (Period.ofDays(30).getDays() / getPeriod().getDays()) * salary;
	}
	
	public double getYearlyIncome()
	{
		return (Period.ofDays(365).getDays() / getPeriod().getDays()) * salary;
	}

	public double getSalary()
	{
		return this.salary;
	}
}
