package com.bilgeadam.lesson029.lessons;

public enum LessonSubject
{
JAVA("Java"),
PYTHON("Python");
	
	private String subject;
	
	LessonSubject(String subject)
	{
		this.subject = subject;
	}

	public String getSubject()
	{
		return this.subject;
	}

}
