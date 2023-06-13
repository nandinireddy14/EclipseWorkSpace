package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemoPrepared2 {

	static ResultSet rs;
	static int cnt;
	public static void displayHeading() throws SQLException
	{
		ResultSetMetaData rm=rs.getMetaData();
		cnt=rm.getColumnCount();
		
		for(int i=1;i<=cnt;i++)
		{
			System.out.print(rm.getColumnName(i)+"\t");
		}
		System.out.println();
		
	}
	public static void displayData() throws Exception
	{
//		ResultSetMetaData rm=rs.getMetaData();
//		int cnt=rm.getColumnCount();
		while(rs.next())
		{
			for(int i=1;i<=cnt;i++)
			{
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
		rs.close();
	}
	
	
	
	
//	public static void display() throws Exception
//	{
//		ResultSetMetaData rm=rs.getMetaData();
//		int cnt=rm.getColumnCount();
//		
//		for(int i=1;i<=cnt;i++)
//		{
//			System.out.print(rm.getColumnName(i)+"\t");
//		}
//		System.out.println();
//		
//		while(rs.next())
//		{
//			for(int i=1;i<=cnt;i++)
//			{
//				System.out.print(rs.getString(i)+"\t");
//			}
//			System.out.println();
//		}
//		rs.close();
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		
		try {
			
			Class.forName("org.postgresql.Driver");
			String query="select * from emp where empid=?";
			try(Connection conn=DriverManager.getConnection(url,username,password);
					PreparedStatement ps = conn.prepareStatement(query);) {
				ps.setInt(1, 122);
				rs=ps.executeQuery();
				
				displayHeading();
				displayData();
				
				
				ps.setInt(1, 126);
				rs=ps.executeQuery();
				
//				displayHeading();
				displayData();
				
				ps.setInt(1, 108);
				rs=ps.executeQuery();
				
//				displayHeading();
				displayData();

				
				
//				try {
//				display();
//				}
//				catch(Exception e)
//				{
//					System.out.println(e);
//				}
				
//				ResultSetMetaData rm=rs.getMetaData();
//				int cnt=rm.getColumnCount();
//				
//				for(int i=1;i<=cnt;i++)
//				{
//					System.out.print(rm.getColumnName(i)+"\t");
//				}
//				System.out.println();
//				
//				while(rs.next())
//				{
//					for(int i=1;i<=cnt;i++)
//					{
//						System.out.print(rs.getString(i)+"\t");
//					}
//					System.out.println();
//				}
//				rs.close();
				
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
			catch(Exception e)
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
