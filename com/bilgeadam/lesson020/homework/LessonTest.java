package com.bilgeadam.lesson020.homework;

public class LessonTest
{

	public static void main(String[] args)
	{
	
		Address studentAddress = new Address(City.ISTANBUL, Street.PAPATYA);
		Address teacherAddress = new Address(City.ANKARA, Street.LALE);
		
		Teacher teacher = new Teacher("Mehmet", "Computer Science", teacherAddress);
		Student student = new Student("Ahment", "Java", studentAddress);
		Course course = new Course("Java", "how arrays work in java");
		
		PrivateLesson lesson = new PrivateLesson(teacher, student, course);
		
		System.out.println("This is an online lesson where our teacher from " + lesson.getTeacher().getAddress().getCity() + " at " + lesson.getTeacher().getAddress().getStreet() + " street");
		System.out.println("gives private lessons to our student who is from " + lesson.getStudent().getAddress().getCity() + " at " + lesson.getStudent().getAddress().getStreet() + " street.");
		System.out.println();
		System.out.println("Teacher " + lesson.getTeacher().getName() + " " + lesson.getTeacher().getIdNumber() + " of " + lesson.getTeacher().getBranch());
		System.out.println("is going to give lessons to student " + lesson.getStudent().getName() + " " + lesson.getStudent().getIdNumber());
		System.out.println("who is taking " + lesson.getStudent().getCourseTaken() + "lessons.");
		System.out.println("Todays course is " + lesson.getCourse().getName() + " which teaches " + lesson.getCourse().getDescription());
		
		
	}

	

}
