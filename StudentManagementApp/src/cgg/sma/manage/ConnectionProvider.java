package cgg.sma.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	static Connection conn;
	public static Connection createConnection()
	{
		try {
			//load the driver
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/cgg_interns";
			String username="postgres";
			String password="nandini14";
			conn=DriverManager.getConnection(url,username,password);
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		return conn;
	}
}
