package com.bilgeadam.lesson007.practice;

import javax.swing.JOptionPane;

public class PrintFunctions
{

	public static void main(String[] args)
	{
		String hello = "Hello";
		String world = "world!";
// println() continues at next line	
		System.out.println(hello + " " + world);
// print does not
		System.out.print(hello + " ");
		System.out.print(world);
//JOptionPane opens a box
		JOptionPane.showMessageDialog(null, hello + " " + world, hello + " " + world, 1);
		JOptionPane.showConfirmDialog(null, "You Sure?");
	}

}
