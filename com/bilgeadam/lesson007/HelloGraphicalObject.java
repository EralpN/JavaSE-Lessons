package com.bilgeadam.lesson007;

import javax.swing.JOptionPane;

public class HelloGraphicalObject
{
	public void hello()
	{
		JOptionPane.showMessageDialog(null, "Hello", "Greetings", JOptionPane.INFORMATION_MESSAGE);
	}

	public void bye()
	{
		JOptionPane.showMessageDialog(null, "Bye", "See You", JOptionPane.WARNING_MESSAGE);
	}
}