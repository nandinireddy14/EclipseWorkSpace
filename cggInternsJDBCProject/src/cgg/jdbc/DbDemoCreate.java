package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemoCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(url,username,password);
		
		Statement stm = conn.createStatement();
		
		//String dropCmd="drop table if exists emp";
		String createCmd="create table emp(empid int primary key,ename varchar(40),salary numeric(12,2))";
		
		//stm.execute(dropCmd);
		stm.execute("drop table if exists emp");
		stm.execute(createCmd);
		
		System.out.println("Table Created..");
		
		stm.close();
		conn.close();
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}

}
