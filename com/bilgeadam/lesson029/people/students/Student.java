package com.bilgeadam.lesson029.people.students;

import java.time.LocalDate;

import com.bilgeadam.lesson029.lessons.LessonSubject;
import com.bilgeadam.lesson029.people.Gender;
import com.bilgeadam.lesson029.people.Name;
import com.bilgeadam.lesson029.people.Person;

public class Student extends Person
{
	private String studentID;
	private LocalDate schoolStart;
	private LocalDate schoolEnd;
	private ContactNumbers contactNumbers;
	LessonSubject subject;
	
	// Graduated
	public Student(Name name, Gender gender, LocalDate birthDate, LessonSubject subject, ContactNumbers contactNumbers, LocalDate schoolStart, LocalDate schoolEnd)
	{
		super(name, gender, birthDate);
		this.subject = subject;
		this.contactNumbers = contactNumbers;
		this.schoolStart = schoolStart;
		this.schoolEnd = schoolEnd;
		studentID = generateID();
	}
	
	// Still in school (no end date)
	public Student(Name name, Gender gender, LocalDate birthDate, LessonSubject subject, ContactNumbers contactNumbers, LocalDate schoolStart)
	{
		super(name, gender, birthDate);
		this.subject = subject;
		this.contactNumbers = contactNumbers;
		this.schoolStart = schoolStart;
		this.schoolEnd = null;
		studentID = generateID();
	}
	
	
	private static int studentCounter = 0;
	private String generateID()
	{
		String year;
		year = schoolStart.getYear() + "-";
		String idnum = String.format("%03d", ++studentCounter);
		return year + idnum;
	}

	public String getStudentID()
	{
		return this.studentID;
	}

	public LocalDate getSchoolStart()
	{
		return this.schoolStart;
	}

	public LocalDate getSchoolEnd()
	{
		return this.schoolEnd;
	}

	public String getMobileNumber()
	{
		return this.contactNumbers.getMobile();
	}
	
	public String getHomeNumber()
	{
		return this.contactNumbers.getHome();
	}
	
	public String getGuardianNumber()
	{
		return this.contactNumbers.getGuardian();
	}

	public String getSubject()
	{
		return this.subject.getSubject();
	}

}
