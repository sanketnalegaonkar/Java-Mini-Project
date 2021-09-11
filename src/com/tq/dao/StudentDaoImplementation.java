package com.tq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tq.Configuration.DBConnection;
import com.tq.model.Result;
import com.tq.model.Student;

public class StudentDaoImplementation implements StudentDao {

	static Connection con = DBConnection.getConnection();
	Student stud = new Student();
	Result res = new Result();

	@Override
	public int add(Student stud) throws SQLException {
		// Add a new student
		int n = 0;
		try {
			String query = "insert into Student(Student_ID, " + " Student_Name, "
					+ " Student_Details) VALUES (?, ?, ?)";
		
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, stud.getStudent_ID());
			ps.setString(2, stud.getStudent_Name());
			ps.setString(3, stud.getStudent_Details());
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		//System.out.println("Adding a student...");
		return n;

	}

	@Override
	public void delete(int id) throws SQLException {
		// Delete a student
		try {
			String query = "delete from Student where Student_ID =?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} 
		//System.out.println("Deleting a student...");
	}

	@Override
	public List<Student> getStudents() throws SQLException {
		// Get List of students
		List<Student> ls = new ArrayList();
		try {

			String query = "select * from Student";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				stud.setStudent_ID(rs.getInt("Student_ID"));
				stud.setStudent_Name(rs.getString("Student_Name"));
				stud.setStudent_Details(rs.getString("Student_Details"));
				ls.add(stud);
			}
		}
		 catch (Exception e) {
			e.printStackTrace();
		} 
		
		//System.out.println("Getting all students...");
		return ls;
	}

	@Override
	public void update(Student stud) throws SQLException {
		// To Update Student details
		try {
			String query = "update Student set Student_Name= ?, " + " Student_Details= ? where Student_ID = ?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, stud.getStudent_Name());
			ps.setString(2, stud.getStudent_Details());
			ps.setInt(3, stud.getStudent_ID());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} //System.out.println("Updating a student...");

	}

	@Override
	public Student getStudent(int id) throws SQLException {
		// TODO Auto-generated method stub
		boolean check = false;
		try {

			String query = "select * from Student where Student_ID= ?";
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				check = true;
				stud.setStudent_ID(rs.getInt("Student_ID"));
				stud.setStudent_Name(rs.getString("Student_Name"));
				stud.setStudent_Details(rs.getString("Student_Details"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

		if (check == true) {
			//System.out.println("Get student by ID...");
			return stud;
		} else
			return null;

	}

	@Override
	public int addMarks(Result res) throws SQLException { // Add Marks
		int n = 0;
		try {
			String query = "insert into Result(Sub1, " + " Sub2, " + " Sub3) VALUES (?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, res.getSub1());
			ps.setInt(2, res.getSub2());
			ps.setInt(3, res.getSub3());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} //System.out.println("Adding marks for a student...");

		return n;
	}

	@Override
	public void updateMarks(Result res) throws SQLException { // Update Marks
		try {
			String query = "update result set  Sub1= ?, " + " Sub2= ?, " + " Sub3= ? where Result_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, res.getSub1());
			ps.setInt(2, res.getSub2());
			ps.setInt(3, res.getSub3());
			ps.setInt(4, res.getRid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} //System.out.println("Updating marks for a student...");

	}

	@Override
	public Result getResult(int id) throws SQLException { // Get Result
		boolean check = false;
		try {
			String query = "select * from result where Result_id= ?";
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				check = true;
				res.setSub1(rs.getInt("Sub1"));
				res.setSub2(rs.getInt("Sub2"));
				res.setSub3(rs.getInt("Sub3"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		if (check == true) {
			//System.out.println("Get result for a student...");
			return res;
		} else
			return null;
	}

	@Override
	public void deleteResult(int id) throws SQLException { // Delete Result
		try {

			String query = "delete from result where Result_id =?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} //System.out.println("Deleting a student...");

	}

}
