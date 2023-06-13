package cgg.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import org.postgresql.Driver;

public class DbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
			//register driver with DriverManager Class
			//Class.forName("org.postgresql.Driver");
			
			//second way of registering driver with DriverManager Class
			DriverManager.registerDriver(new Driver());
			
			
			//getConnection object
			Connection connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
			
			connection.close();
		}
//		catch(ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}

}
