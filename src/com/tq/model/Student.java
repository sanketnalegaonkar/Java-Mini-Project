package com.tq.model;

public class Student {

	int student_ID;
	String student_Name;
	String student_Details;

	public Student() {
		super();
		this.student_ID = student_ID;
		this.student_Name = student_Name;
		this.student_Details = student_Details;

	}

	public int getStudent_ID() {
		return student_ID;
	}

	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public String getStudent_Details() {
		return student_Details;
	}

	public void setStudent_Details(String student_Details) {
		this.student_Details = student_Details;
	}

	@Override
	public String toString() {
		return "Student [student_ID=" + student_ID + ", student_Name=" + student_Name + ", student_Details="
				+ student_Details + "]";
	}

}
