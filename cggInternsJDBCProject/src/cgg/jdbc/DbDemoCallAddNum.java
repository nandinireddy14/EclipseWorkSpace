package cgg.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DbDemoCallAddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
		Class.forName("org.postgresql.Driver");
		String sql="call spAddNum(?,?,?)";
		try(Connection conn=DriverManager.getConnection(url,username,password);
				CallableStatement cs=conn.prepareCall(sql);)
		{
			cs.setInt(1, Integer.parseInt(args[0]));
			cs.setInt(2,Integer.parseInt(args[1]));
			
			cs.registerOutParameter(3, Types.INTEGER);
			
			cs.execute();
			
			int result =cs.getInt(3);
			
			System.out.println("Sum = "+result);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
