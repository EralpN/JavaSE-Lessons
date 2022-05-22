package com.bilgeadam.lesson023.homework.payroll;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager
{

	private List<Employee> employees = new ArrayList<>();
	private List<Payroll> employeePays = new ArrayList<>();
	private Scanner askString = new Scanner(System.in);
	private Scanner askNumber = new Scanner(System.in);
	private boolean exit = false;
	private boolean next = false;

	public static void main(String[] args)
	{
		EmployeeManager manager = new EmployeeManager();
		manager.employeeMenu();
		manager.payrollMenu();
	}

	private void employeeMenu()
	{
		while (exit == false && next == false)
		{
		System.out.println();
		int selection;
		System.out.println("What would you like to do?");
		System.out.println("0 - Exit");
		System.out.println("1 - Add Employee");
		System.out.println("2 - Remove Employee");
		System.out.println("3 - List Employees");
		System.out.println("4 - Sort Employees by Name");
		System.out.println("5 - Sort Employees by ID");
		System.out.println("6 - Enter salary information (next menu)");
		do
		{
			selection = askNumber.nextInt();
		}
		while (!(selection >= 0 && selection < 7));

		switch (selection)
		{
		case 0:
			exit = true;
			askString.close();
			askNumber.close();
			break;
		case 1:
			System.out.println("Who is the new employee?");
			employees.add(new Employee(askString.nextLine()));
			break;
		case 2:
			System.out.println("Who is the employee to be removed?");
			String employeeRemove = askString.nextLine();
			for (int i = 0; i < employees.size(); i++)
			{
				if (employees.get(i).getName().equalsIgnoreCase(employeeRemove))
				{
					employees.remove(i);
					break;
				}
			}
			break;
		case 3:
			if (employees.size() == 0)
			{
				System.out.println("Add employees first!");
			}
			else
			{
				listEmployees();
			}
			break;
		case 4:
		{
			if (employees.size() < 2)
			{
				System.out.println("Add more employees to sort!");
			}
			else
			{
				sortEmployeesName();
			}
			break;
		}
		case 5:
		{
			if (employees.size() < 2)
			{
				System.out.println("Add more employees to sort!");
			}
			else
			{
				sortEmployeesID();
			}
			break;
		}
		case 6:
			if (employees.size() < 2)
			{
				System.out.println("Add at least two employees to continue!");
			}
			else
			{
				initiatePayroll();
				next = true;
				break;
			}
			break;
		}
		}

	}
	
	private void payrollMenu()
	{
		while (exit == false)
		{
		System.out.println();
		int selection;
		System.out.println("What would you like to do?");
		System.out.println("0 - Exit");
		System.out.println("1 - List Employees and Income");
		System.out.println("2 - Sort Employees by Name");
		System.out.println("3 - Sort Employees by ID");
		System.out.println("4 - Sort Employees by Income");
		do
		{
			selection = askNumber.nextInt();
		}
		while (!(selection >= 0 && selection < 5));

		switch (selection)
		{
		case 0:
			exit = true;
			askString.close();
			askNumber.close();
			break;
		case 1:
			listPayroll();
			break;
		case 2:
			sortNamePayroll();
			break;
		case 3:
			sortIDPayroll();
			break;
		case 4:
			sortIncomePayroll();
			break;
		}
		}

	}

	
	private void initiatePayroll()
	{
		if (exit == false)
		{
		for (Employee employee : employees)
		{
			System.out.println("How often does " + employee.getName() + " gets paid? (days)");
			Period period = Period.ofDays(askNumber.nextInt());
			System.out.println("How much does " + employee.getName() + " gets paid?");
			double salary = askNumber.nextDouble();
			employeePays.add(new Payroll(period, employee, salary));
		}
		}
	}
	
	private void listEmployees()
	{
		for (Employee employee : employees)
		{
			System.out.println("Name: " + employee.getName() + "\tID: " + employee.getiD());
		}
	}
	
	private void listPayroll()
	{
		for (Payroll pay : employeePays)
		{
			System.out.println("Name: " + pay.getEmployee().getName() + "\tID: " + pay.getEmployee().getiD() + "\t\tMonthly income: " + (int)pay.getMonthlyIncome() + "\t\tYearly income: " + (int)pay.getYearlyIncome());
		}
	}

	private void sortEmployeesName()
	{
		Collections.sort(employees, new Comparator<Employee>()
		{
			// ascending sort
			public int compare(Employee first, Employee second)
			{
				return first.getName().compareTo(second.getName());
			}
		});
	}

	private void sortEmployeesID()
	{
		Collections.sort(employees, new Comparator<Employee>()
		{
			public int compare(Employee first, Employee second)
			{
				return first.getiD().compareTo(second.getiD());
			}
		});
	}
	
	private void sortIncomePayroll()
	{
		Collections.sort(employeePays, new Comparator<Payroll>()
		{
			public int compare(Payroll first, Payroll second)
			{
				return (int) (first.getYearlyIncome() - second.getYearlyIncome());
			}
		});
	}
	
	private void sortNamePayroll()
	{
		Collections.sort(employeePays, new Comparator<Payroll>()
		{
			public int compare(Payroll first, Payroll second)
			{
				return first.getEmployee().getName().compareTo(second.getEmployee().getName());
			}
		});
	}

	private void sortIDPayroll()
	{
		Collections.sort(employeePays, new Comparator<Payroll>()
		{
			public int compare(Payroll first, Payroll second)
			{
				return first.getEmployee().getiD().compareTo(second.getEmployee().getiD());
			}
		});
	}
}
