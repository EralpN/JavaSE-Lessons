package com.bilgeadam.lesson029;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.bilgeadam.lesson029.lessons.Lesson;
import com.bilgeadam.lesson029.lessons.LessonSubject;
import com.bilgeadam.lesson029.people.Gender;
import com.bilgeadam.lesson029.people.Name;
import com.bilgeadam.lesson029.people.employees.Clerk;
import com.bilgeadam.lesson029.people.employees.Employee;
import com.bilgeadam.lesson029.people.employees.Servant;
import com.bilgeadam.lesson029.people.employees.Teacher;
import com.bilgeadam.lesson029.people.students.ContactNumbers;
import com.bilgeadam.lesson029.people.students.Student;

public class SchoolManagementSystem
{
	
	private HashMap<String, Student> students = new HashMap<>();
	private HashMap<String, Employee> employees = new HashMap<>();
	private ArrayList<Student> studentsInLesson = new ArrayList<>();
	private ArrayList<Teacher> teachersInLesson = new ArrayList<>();
	private Lesson latestLesson;
	private boolean exit = false;
	
	public static void main(String[] args)
	{
		SchoolManagementSystem test = new SchoolManagementSystem();
		
		// creating students without scanner
		System.out.println("Creating students with the given information.");
		test.createStudents();
		System.out.println();
		
		// creating employees without scanner
		System.out.println("Creating employees with the given information.");
		test.createEmployees();
		System.out.println();
		
		
		test.isMarriedDivorced("TCH-004");
		// One of the teachers is divorcing
		test.employees.get("TCH-004").changeMarriedDivorced("Newlastname");
		test.isMarriedDivorced("TCH-004");
		System.out.println();
		
		System.out.println("Creating the lesson with the given information.");
		test.latestLesson = test.createLesson();
		System.out.println();
		
		test.menu();
		
		System.out.println("Bye!");

	}
	
	
	private void menu()
	{
		Scanner askNumber = new Scanner(System.in);
		while (exit == false)
		{
		System.out.println();
		int selection;
		System.out.println("What would you like to do?");
		System.out.println("0 - Exit");
		System.out.println("1 - Add Employee (EMPLOYEES ALREADY ADDED OPTION CANCELED)");
		System.out.println("2 - List Employees");
		System.out.println("3 - New lesson (NEW LESSON ALREADY CREATED OPTION CANCELED)");
		System.out.println("4 - Add student to lesson (PROGRAM ALREADY ADDS ALL STUDENTS THAT TAKES THE SUBJECT TO LESSON)");
		System.out.println("5 - List people in the lesson");
		System.out.println("6 - Are there any birthdays today?");
		do
		{
			selection = askNumber.nextInt();
		}
		while (!(selection >= 0 && selection < 7));
		
		switch (selection)
		{
		case 0:
			exit = true;
			askNumber.close();
			break;
		case 1:
			System.out.println();
			System.out.println("EMPLOYEES ALREADY ADDED OPTION CANCELED");
			break;
		case 2:
			System.out.println();
			employeeList();
			break;
		case 3:
			System.out.println();
			System.out.println("NEW LESSON ALREADY CREATED OPTION CANCELED");
			break;
		case 4:
			System.out.println();
			System.out.println("PROGRAM ALREADY ADDS ALL STUDENTS THAT TAKES THE SUBJECT TO LESSON");
			break;
		case 5:
			System.out.println();
			lessonAttendance();
			break;
		case 6:
			System.out.println();
			birthDayList();
			break;
		}
		}
	}
	
	
	private void isMarriedDivorced(String employeeID)
	{
		if (employees.get(employeeID).isMarried())
		{
			System.out.println(employees.get(employeeID).getName() + " is married.");
		}
		else
		{
			System.out.println(employees.get(employeeID).getName() + " is single.");
		}
	}
	
	// Checks if it is anyones birthday today and sends gifts if they are female.
	private void birthDayList()
	{
		boolean birthday = false;
		for (Employee employee : employees.values())
		{
			if (employee.getWorkEnd() == null)
			{
				if (employee.getBirthDate().getMonthValue() == LocalDate.now().getMonthValue() || employee.getBirthDate().getDayOfMonth() == LocalDate.now().getDayOfMonth())
				{
					System.out.println("Today is the birthday of " + employee.getName() + "!");
					birthday = true;
					if (employee.getGender().equals(Gender.FEMALE))
					{
						System.out.println("Sending gifts to " + employee.getName() + "!");
					}
				}
			}
		}
		if (birthday == false)
		{
			System.out.println("There are no birthdays today.");
		}
	}

	// lists everyone in a lesson.
	private void lessonAttendance()
	{
		System.out.println(latestLesson.getSubject() + " Lesson");
		System.out.println();
		System.out.println("Teachers in lesson:");
		for (Teacher teacher : teachersInLesson)
		{
			System.out.println(teacher.getName() + "\t" + teacher.getEmployeeID());
		}
		System.out.println();
		System.out.println("Students in lesson:");
		for (Student student : studentsInLesson)
		{
			System.out.println(student.getName() + "\t" + student.getStudentID());
		}
	}
	
	// lists all employees.
	private void employeeList()
	{
		
		System.out.println("Employees that are still working: ");
		for (Employee employee : employees.values())
		{
			if (employee.getWorkEnd() == null)
			{
				System.out.println(employee.getName() + "\t" + employee.getEmployeeID() + "\t\tStarting Salary: " + (int)employee.getStartSalary() + "\t\tCurrent Salary: " + (int)employee.getLatestSalary());
			}
		}
		System.out.println();
		System.out.println("Employees that have worked in the past:");
		for (Employee employee : employees.values())
		{	
			if (employee.getWorkEnd() != null)
			{
				System.out.println(employee.getName() + "\t" + employee.getEmployeeID() + "\t\tStarting Salary: " + (int)employee.getStartSalary() + "\t\tLatest Salary: " + (int)employee.getLatestSalary());
			}
		}
	}
	
	private void createStudents()
	{
		// Ask student info / new students / skipping scanners
		Student student1 = new Student(new Name("Eralp", "Nitelik"), Gender.MALE, LocalDate.of(1996, 2, 15), LessonSubject.JAVA, new ContactNumbers("1234-123-12-12", "1234-123-12-12", "1234-123-12-12"), LocalDate.of(2022, 4, 7));
		students.put(student1.getStudentID(), student1);
		Student student2 = new Student(new Name("First", "Mid", "Last"), Gender.MALE, LocalDate.of(1998, 7, 13), LessonSubject.JAVA, new ContactNumbers("1234-123-12-12", "1234-123-12-12", "1234-123-12-12"), LocalDate.of(2022, 4, 7));
		students.put(student2.getStudentID(), student2);
		Student student3 = new Student(new Name("John", "Doe"), Gender.MALE, LocalDate.of(1968, 11, 5), LessonSubject.PYTHON, new ContactNumbers("1234-123-12-12", "1234-123-12-12", "1234-123-12-12"), LocalDate.of(2016, 1, 7), LocalDate.of(2016, 7, 7));	
		students.put(student3.getStudentID(), student3);	
	}
	
	private void createEmployees()
	{
		// Ask employee info / new employees / skipping scanners
		Clerk clerk = new Clerk(new Name("Female", "Birthday", "Person"), Gender.FEMALE, LocalDate.now().minusYears(36), false, LocalDate.of(2020, 2, 1), 8000, "1234-123-12-12");
		employees.put(clerk.getEmployeeID(), clerk);
		Servant servant = new Servant(new Name("Jaidan", "Hoff"), Gender.MALE, LocalDate.of(1985, 9, 25), true, LocalDate.of(2018, 10, 1), LocalDate.of(2021, 11, 11), 6000, "1234-123-12-12");
		employees.put(servant.getEmployeeID(), servant);
		Teacher teacher1 = new Teacher(new Name("Mallory", "Amy", "Ramirez"), Gender.FEMALE, LocalDate.of(1976, 01, 27), true, LocalDate.of(2011, 9, 1), 10000, "1234-123-12-12");
		employees.put(teacher1.getEmployeeID(), teacher1);
		Teacher teacher2 = new Teacher(new Name("Sydney", "Douglas"), Gender.FEMALE, LocalDate.of(1981, 01, 27), false, LocalDate.of(2009, 12, 1), 10000, "1234-123-12-12");
		employees.put(teacher2.getEmployeeID(), teacher2);
	}
	
	private Lesson createLesson()
	{
		
		// Ask lesson subject to user.
		// Add all students with given subject to a list
		for (Student student : students.values())
		{
			if (student.getSubject().equals(LessonSubject.JAVA.getSubject()))
			{
				studentsInLesson.add(student);
			}
		}
		
		// Ask which employees (ID) should be teaching the lesson
		// Lessons method only accepts teachers. For additional employee controls if (charAt[0] != 'T') give error.
		String teacher1 = "TCH-003";
		String teacher2 = "TCH-004";
		
		
		// Add given employeeID's to teacherInLesson list
		teachersInLesson.add((Teacher)employees.get(teacher1));
		teachersInLesson.add((Teacher)employees.get(teacher2));
		
		// Create lesson with the given teachers
		Lesson javaLesson = new Lesson(LessonSubject.JAVA, (Teacher)employees.get(teacher1), (Teacher)employees.get(teacher2), LocalDate.now(), studentsInLesson);
		return javaLesson;
	}
}
