package com.tq.dao;

import java.sql.SQLException;
import java.util.List;

import com.tq.model.Result;
import com.tq.model.Student;

public interface StudentDao {
	// Add a new student
	public int add(Student stud) throws SQLException;

	// Update a Student
	public void update(Student stud) throws SQLException;

	// Delete a student
	public void delete(int id) throws SQLException;

	// Get student details by ID
	public Student getStudent(int id) throws SQLException;

	// List of Students
	public List<Student> getStudents() throws SQLException;
	
	// Add marks
		public int addMarks(Result res) throws SQLException;

		// Update marks
		public void updateMarks(Result res) throws SQLException;
		
		//get Result
		public Result getResult(int id) throws SQLException;

		// Delete a result
		public void deleteResult(int id) throws SQLException;
	

}
