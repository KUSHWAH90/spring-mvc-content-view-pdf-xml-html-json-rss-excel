package com.santosh.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.santosh.spring.model.Student;

public class Studentdaoimpl implements Studentdao {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Student> getAll() {
		String query = "select * from information";
		List<Student> empList = new ArrayList<Student>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()){
				Student st = new Student();
				st.setId(rs.getInt("id"));
				st.setFirstname(rs.getString("firstname"));
				st.setLastname(rs.getString("lastname"));
				st.setDob(rs.getDate("dob"));
				st.setAddress(rs.getString("address"));
				st.setCity(rs.getString("city"));
				st.setMobile(rs.getString("mobile"));
				st.setPincode(rs.getInt("pincode"));
				st.setEmail(rs.getString("email"));
				empList.add(st);
				System.out.println(st);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return empList;
	}

}