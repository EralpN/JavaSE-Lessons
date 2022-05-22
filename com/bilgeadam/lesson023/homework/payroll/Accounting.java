package com.bilgeadam.lesson023.homework.payroll;

import java.time.Period;

public abstract class Accounting
{
	private Period period;
	private Employee employee;
	
	public Accounting(Period period, Employee employee)
	{
		this.period = period;
		this.employee = employee;
	}

	public Period getPeriod()
	{
		return this.period;
	}

	public Employee getEmployee()
	{
		return this.employee;
	}
	
	
}
