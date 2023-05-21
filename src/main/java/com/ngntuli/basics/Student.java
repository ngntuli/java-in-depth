package com.ngntuli.basics;

class Student {
	// variable declarations
	private static int studentCount;

	private static int idInitializer = 1000;
	private int id;
	private String name;
	private String gender = "male";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	// Constructors
	public Student(int id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;

		id = ++idInitializer;
		studentCount++;
		System.out.println("ID of " + name + " is " + id);
	}

	// method definitions
	boolean updateProfile(String name) {
		this.name = name;
		return true;
	}
}
