package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.SQLException;

public class DbDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		
		Properties properties=new Properties();
		properties.put("user", "postgres");
		properties.put("password", "nandini14");
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection connection = DriverManager.getConnection(url,properties);
			
			System.out.println("Connection Established");
			
			connection.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
	}

}
