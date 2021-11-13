package com.javatutorial.classobjects;

public class Student {
	
	//Data members or Attributes of a class
	int rollNo = 20;
	long regNo = 2019;
	String name = "Dora";
	char sec = 'A';
	
	//Method to display name
	public void displayStudentName() {
		System.out.println(name);
	}
	
	public int displayRollNo() {
		return rollNo;
	}
	
	public static void main(String args[]) {
		Student std = new Student();
		System.out.println(std);
		std.displayStudentName();
		int roll = std.displayRollNo();
		System.out.println(roll);
	}

}
