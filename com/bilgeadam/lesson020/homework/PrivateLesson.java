package com.bilgeadam.lesson020.homework;

public class PrivateLesson
{

	private Teacher teacher;
	private Student student;
	private Course course;
	
	public PrivateLesson(Teacher teacher, Student student, Course course)
	{
		this.teacher = teacher;
		this.student = student;
		this.course = course;
	}
	
	

	public Teacher getTeacher()
	{
		return this.teacher;
	}

	public Student getStudent()
	{
		return this.student;
	}

	public Course getCourse()
	{
		return this.course;
	}

}
