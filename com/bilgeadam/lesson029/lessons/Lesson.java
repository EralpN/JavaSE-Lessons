package com.bilgeadam.lesson029.lessons;

import java.time.LocalDate;
import java.util.ArrayList;

import com.bilgeadam.lesson029.people.employees.Teacher;
import com.bilgeadam.lesson029.people.students.Student;

public class Lesson
{
	LessonSubject subject;
	LocalDate lessonDate;
	ArrayList<Student> studentsInLesson;
	Teacher teacher1;
	Teacher teacher2;

	public Lesson(LessonSubject subject, Teacher teacher1, Teacher teacher2, LocalDate lessonDate, ArrayList<Student> studentsInLesson)
	{
		this.subject = subject;
		this.teacher1 = teacher1;
		this.teacher2 = teacher2;
		this.studentsInLesson = studentsInLesson;
		this.lessonDate = lessonDate;
	}

	public String getSubject()
	{
		return this.subject.getSubject();
	}

	public void setSubject(LessonSubject subject)
	{
		this.subject = subject;
	}

	public LocalDate getLessonDate()
	{
		return this.lessonDate;
	}

	public void setLessonDate(LocalDate lessonDate)
	{
		this.lessonDate = lessonDate;
	}

	public ArrayList<Student> getStudentsInLesson()
	{
		return this.studentsInLesson;
	}

	public void setStudentsInLesson(ArrayList<Student> students)
	{
		this.studentsInLesson = students;
	}

	public Teacher getTeacher1()
	{
		return this.teacher1;
	}

	public void setTeacher1(Teacher teacher1)
	{
		this.teacher1 = teacher1;
	}

	public Teacher getTeacher2()
	{
		return this.teacher2;
	}

	public void setTeacher2(Teacher teacher2)
	{
		this.teacher2 = teacher2;
	}

}
