package cgg.sma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cgg.sma.manage.ConnectionProvider;
import cgg.sma.model.Student;

public class StudentDAO {

	Connection conn;

	public StudentDAO() {
		super();
		conn=ConnectionProvider.createConnection();
	}
	
	public boolean insertStudentToDB(Student st)
	{
		boolean f=false;
		
		try {
			String q="insert into students(student_name,student_phone,student_city) values(?,?,?)";
			
			//preparedStatement..
			PreparedStatement ps = conn.prepareStatement(q);
			
			//set the parameters
			
			ps.setString(1, st.getsName());
			ps.setString(2, st.getsPhone());
			ps.setString(3, st.getsCity());
			
			//execute
			ps.executeUpdate();
			
			f=true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return f;
	}
	
	public boolean deleteStudent(int userId)
	{
		boolean f=false;
		try {
			String q="delete from students where student_id =?";
			//preparedStatement..
			PreparedStatement ps = conn.prepareStatement(q);
			
			//set the parameters
			
			ps.setInt(1, userId);
			
			//execute
			ps.executeUpdate();
			
			f=true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return f;
	}

	public void showAllStudents() {
		
		try {
			String query="select * from students";
			Statement cs = conn.createStatement();
			ResultSet rs = cs.executeQuery(query);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String phone=rs.getString(3);
				String city=rs.getString(4);
				
				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+phone);
				System.out.println("City : "+city);
			}
			rs.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	public boolean updateStudent(Student st) {
		boolean f=false;
		
		try {
			String q="update students set student_phone=?,student_city=? where student_id=?";
			
			//preparedStatement..
			PreparedStatement ps = conn.prepareStatement(q);
			
			//set the parameters

			ps.setString(1, st.getsPhone());
			ps.setString(2, st.getsCity());
			ps.setInt(3, st.getsId());
			
			//execute
			ps.executeUpdate();
			
			f=true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return f;
		
	}
	
}
