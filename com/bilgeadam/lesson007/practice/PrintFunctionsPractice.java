package com.bilgeadam.lesson007.practice;

import javax.swing.JOptionPane;

public class PrintFunctionsPractice
{

	public static void main(String[] args)
	{
// name and surname defined
		String name = "Eralp";
		String surname = "Nitelik";
// name and surname in a single line
		System.out.print(name + " ");
		System.out.println(surname);
// name and surname on separate lines
		System.out.println(name);
		System.out.print(surname);
// warning message test
		JOptionPane.showMessageDialog(null, "Oops. Someting went wrong.", "System Error", 0);
	}

}
