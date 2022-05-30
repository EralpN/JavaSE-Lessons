package com.bilgeadam.lesson026;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample
{

	public static void main(String[] args)
	{
		String data = "This text is my data.";
		
		try (OutputStream output = new FileOutputStream("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\Output.txt"))
		{
			byte[] dataBytes = data.getBytes();
			output.write(dataBytes);
			System.out.println("Data is written in Output file.");
			
			output.flush(); // Recommended for buffer
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
