package com.bilgeadam.lesson027;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StudentClass implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String name;
	private String subject;
	private List<Student> students;
	
	public StudentClass(String code, String name, String subject)
	{
		super();
		this.code = code;
		this.name = name;
		this.subject = subject;
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student)
	{
		this.students.add(student);
	}
	
	public String getCode()
	{
		return this.code;
	}

	public String getName()
	{
		return this.name;
	}

	public String getSubject()
	{
		return this.subject;
	}

	public List<Student> getStudents()
	{
		return this.students;
	}

	@Override
	public String toString()
	{
		return "StudentClass [code=" + this.code + ", name=" + this.name + ", subject=" + this.subject + ", students="
				+ this.students + "]";
	}
}
