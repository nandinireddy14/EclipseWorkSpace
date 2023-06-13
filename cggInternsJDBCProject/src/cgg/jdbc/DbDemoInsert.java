package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url,username,password);
			Statement stm = conn.createStatement();
			
			int empno=Integer.parseInt(args[0]);
			String ename=args[1];
			double salary=Double.parseDouble(args[2]);
			
			String insertCmd="insert into emp values("+empno+",'"+ename+"',"+salary+")";
			
			int cnt = stm.executeUpdate(insertCmd);
			
			System.out.println(cnt+" rows(s) inserted");
			
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
