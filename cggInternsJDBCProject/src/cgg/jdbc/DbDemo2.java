package cgg.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.Statement;

public class DbDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
			Class.forName("org.postgresql.Driver");
		}
		catch(ClassNotFoundException e)
		{
			//e.printStackTrace();
			System.out.println(e);
		}
		try(Connection conn=DriverManager.getConnection(url,username,password); Statement stm=conn.createStatement())
		{
			System.out.println("Connection Established");
			String dropCmd="drop table if exists student1";
			String createCmd="create table student1(rollno int primary key,name varchar(50),age int)";
			stm.execute(dropCmd);
			stm.execute(createCmd);
			System.out.println("Table created..");
			String insertCmd="insert into student1 values(1,'abc',20)";
			int cnt=stm.executeUpdate(insertCmd);
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		

	}

}
