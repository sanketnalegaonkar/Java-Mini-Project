package com.tq.controller;

import java.sql.SQLException;
import java.util.List;

import com.tq.dao.StudentDaoImplementation;
import com.tq.model.Result;
import com.tq.model.Student;

public class Application {

	public static void main(String[] args) throws SQLException {
		StudentDaoImplementation studDao = new StudentDaoImplementation();
		Student stud = new Student();
		
		
		  
		  stud.setStudent_ID(9); stud.setStudent_Name("Brann");
		  stud.setStudent_Details("Aus");
		 
		
		// add
		 studDao.add(stud);

		// read All 
			List<Student> ls = studDao.getStudents(); 
			for (Student allStud:ls) { System.out.println("Student Details are:" + allStud); }
			 
		// Delete
	//	studDao.delete(4);

		

		// update

		/*
		 * Student stud1=studDao.getStudent(15);
		 * 
		 * stud1.setStudent_Name("Smita"); stud1.setStudent_Details("Pune");
		 * studDao.update(stud1);
		 */

		// Add marks
		Result res = new Result();
		res.setSub1(30);
		res.setSub2(50);
		res.setSub3(25);
		// studDao.addMarks(res);

		// update marks
		Result res1 = studDao.getResult(5);
		res1.setSub1(45);
		res1.setSub2(45);
		res1.setSub3(45);
		studDao.updateMarks(res1);
		
		// Delete result
		studDao.deleteResult(12);

	}

}
