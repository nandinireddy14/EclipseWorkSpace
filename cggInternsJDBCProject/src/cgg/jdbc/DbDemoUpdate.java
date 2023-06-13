package cgg.jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;

public class DbDemoUpdate {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		
		try {
			
			Class.forName("org.postgresql.Driver");
			try(Connection conn=DriverManager.getConnection(url,username,password);Statement stm=conn.createStatement()) {
				String updateCmd="update emp set ename='pop',salary=60000 where empid=104";
				
				int cnt=stm.executeUpdate(updateCmd);
				System.out.println(cnt+" row(s) updated..");
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