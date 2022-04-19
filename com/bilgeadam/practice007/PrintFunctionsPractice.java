package com.bilgeadam.practice007;

import javax.swing.JOptionPane;

public class PrintFunctionsPractice
{

	public static void main(String[] args)
	{
		String name = "Eralp";
		String surname = "Nitelik";

		System.out.print(name + " ");
		System.out.println(surname);

		System.out.print(name + " " + surname);

		JOptionPane.showMessageDialog(null, "Oops. Someting went wrong.", "System Error", 0);
	}

}
