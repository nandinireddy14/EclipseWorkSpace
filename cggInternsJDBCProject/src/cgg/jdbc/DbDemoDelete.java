package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemoDelete {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/cgg_interns";
	String username="postgres";
	String password="nandini14";
	
	
	try {
		
		Class.forName("org.postgresql.Driver");
		try(Connection conn=DriverManager.getConnection(url,username,password);Statement stm=conn.createStatement()) {
//			String deleteCmd="delete from emp where ename='"+args[0]+"'";
			String deleteCmd="delete from emp";
			
			int cnt=stm.executeUpdate(deleteCmd);
			System.out.println(cnt+" row(s) deleted..");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
}
}
