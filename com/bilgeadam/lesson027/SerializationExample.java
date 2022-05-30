package com.bilgeadam.lesson027;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerializationExample
{

	public static void main(String[] args)
	{
		StudentClass clazz = new StudentClass("Java2", "Java Boost", "Java");
		clazz.addStudent(new Student("Joe", 1, LocalDate.of(1997, 05, 05)));
		clazz.addStudent(new Student("Rose", 2, LocalDate.of(1996, 02, 17)));
		clazz.addStudent(new Student("Kevin", 3, LocalDate.of(1995, 11, 28)));
		
		System.out.println(clazz);
		
		// write
		
		try (FileOutputStream fos = new FileOutputStream("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson027\\students.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos))
		{
			oos.writeObject(clazz);
			oos.flush();
			System.out.println("Object written in students.dat");
		}
		catch (Exception e)
		{
			System.err.println("Error " + e.getMessage());
			e.printStackTrace();
		}
		
		// read
		
		StudentClass deserializedClass = null;
		
		try (FileInputStream fis = new FileInputStream("D:\\javalib\\JavaSE Lessons\\com\\bilgeadam\\lesson027\\students.dat");
			ObjectInputStream ois = new ObjectInputStream(fis))
		{
			deserializedClass = (StudentClass)ois.readObject();
			System.out.println("Object read from students.dat");
		}
		catch (Exception e)
		{
			System.err.println("Error " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(deserializedClass);
	}

}
