package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.DBUtility;
import com.model.Student;

public class CrudDao {

private Connection dbConnection;
private PreparedStatement pStmt;

public CrudDao() {
	dbConnection = DBUtility.getConnection();
}

public void addStudent(Student student) {
	String insertQuery = "INSERT INTO STUDENT(STUDENTID, NAME, DEPARTMENT, EMAIL) VALUES (?,?,?,?)";
	try {
		pStmt = dbConnection.prepareStatement(insertQuery);
		pStmt.setInt(1, student.getStudentId());
		pStmt.setString(2, student.getName());
		pStmt.setString(3, student.getDepartment());
		pStmt.setString(4, student.getEmailId());
		pStmt.executeUpdate();
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
}

public void deleteStudent(int studentId) {
	String deleteQuery = "DELETE FROM STUDENT WHERE STUDENTID = ?";
	try {
		pStmt = dbConnection.prepareStatement(deleteQuery);
		pStmt.setInt(1, studentId);
		pStmt.executeUpdate();
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
}

public void updateStudent(Student student) throws ParseException {
	String updateQuery = "UPDATE STUDENT SET NAME = ?, DEPARTMENT = ?, EMAIL = ? WHERE STUDENTID = ?";
	try {
		pStmt = dbConnection.prepareStatement(updateQuery);		
		pStmt.setString(1, student.getName());
		pStmt.setString(2, student.getDepartment());
		pStmt.setString(3, student.getEmailId());
		pStmt.setInt(4, student.getStudentId());
		pStmt.executeUpdate();

	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
}

public List<Student> getAllStudents() {
	List<Student> students = new ArrayList<Student>();

	String query = "SELECT * FROM STUDENT ORDER BY STUDENTID";
	try {
		Statement stmt = dbConnection.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			Student student = new Student();

			student.setStudentId(rs.getInt("STUDENTID"));
			student.setName(rs.getString("NAME"));
			student.setDepartment(rs.getString("DEPARTMENT"));
			student.setEmailId(rs.getString("EMAIL"));
			students.add(student);
		}
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	return students;
}

public List<Student> getAllStudents(int startPageIndex, int recordsPerPage) {
	List<Student> students = new ArrayList<Student>();
	int range = startPageIndex+recordsPerPage;
	String query="SELECT * from (Select M.*, Rownum R From STUDENT M) where r > " + startPageIndex +" and r <= "+range;
	System.out.println(query);
	try 
	{
		Statement stmt = dbConnection.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next())
		{
			Student student = new Student();

			student.setStudentId(rs.getInt("STUDENTID"));
			student.setName(rs.getString("NAME"));
			student.setDepartment(rs.getString("DEPARTMENT"));
			student.setEmailId(rs.getString("EMAIL"));
			students.add(student);
		}
	} 
	catch (SQLException e) 
	{
		System.err.println(e.getMessage());
	}
	return students;
}

public int getStudentCount()
{
	int count=0;
	try 
	{
		Statement stmt = dbConnection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS COUNT FROM STUDENT");		
		while (rs.next()) 
		{
			count=rs.getInt("COUNT");
		}
	} 
	catch (SQLException e) 
	{
		System.err.println(e.getMessage());
	}
	return count;
}
}