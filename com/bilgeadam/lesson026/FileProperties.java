package com.bilgeadam.lesson026;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileProperties
{

	public static void main(String[] args)
	{
		File fileDir = new File("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026");

		if (fileDir.isFile())
		{
			System.out.println("It is a file");
		}

		if (fileDir.isDirectory())
		{
			System.out.println(fileDir.getName());
			System.out.println("It is a directory");
			System.out.println("Contents in directory: ");
			System.out.println();

			String[] fileNames = fileDir.list();
			for (String fileName : fileNames)
			{
				System.out.println(fileName);
				File file = new File(fileDir, fileName);

				System.out.println(file.isDirectory() ? "Is directory" : file.isFile() ? "Is File" : "?");
				System.out.println(file.getAbsolutePath());
				System.out.println(file.canExecute() ? "Can execute" : "Cant execute");
				System.out.println(file.isHidden() ? "Hidden" : "Not hidden");
				System.out.println(file.canRead() ? "Can read" : "Cant read");
				System.out.println(file.canWrite() ? "Can write" : "Cant write");
				System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate());
				System.out.println();

			}
		}
		
		System.out.println("Attempting to create a Third file at given directory");
		File thirdFile = new File("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson026\\Third Text File.txt");
		if (thirdFile.exists())
		{
			System.out.println("File already exists");
		}
		else
		{
			boolean success = false;
			try
			{
				success = thirdFile.createNewFile();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			if (success)
			{
				System.out.println("Third file created");
			}
			else
			{
				System.out.println("Third file not created");
			}
		}
		
		
	}

}
