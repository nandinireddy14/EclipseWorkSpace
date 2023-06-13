package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemoPrepared {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		
		try {
			
			Class.forName("org.postgresql.Driver");
			String insertCmd="insert into emp values(?,?,?)";
			try(Connection conn=DriverManager.getConnection(url,username,password);
					/*PreparedStatement stm=conn.prepareStatement("insert into emp values(?,?,?)")*/
					PreparedStatement stm=conn.prepareStatement(insertCmd)){
					
//				stm.setInt(1, Integer.parseInt(args[0]));
//				stm.setString(2,args[1]);
//				stm.setDouble(3, Double.parseDouble(args[2]));
		
//				int cnt=stm.executeUpdate();
//				System.out.println(cnt+" row(s) inserted");
				
				stm.setInt(1, 126);
				stm.setString(2,"sdf");
				stm.setDouble(3, 312000);
		
				 int cnt=stm.executeUpdate();
				System.out.println(cnt+" row(s) inserted");
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
