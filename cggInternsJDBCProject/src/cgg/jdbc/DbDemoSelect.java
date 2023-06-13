package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DbDemoSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		
		try {
			
			Class.forName("org.postgresql.Driver");
			try(Connection conn=DriverManager.getConnection(url,username,password);Statement stm=conn.createStatement()) {
//				
				String query="select * from emp";
				
				ResultSet rs=stm.executeQuery(query);
				ResultSetMetaData rm = rs.getMetaData();
				int cols=rm.getColumnCount();
				
				for(int i=1;i<=cols;i++)
				{
					System.out.print(rm.getColumnName(i)+"\t");
				}
				System.out.println();
				
//				while(rs.next())
//				{
////					System.out.print(rs.getInt("empid")+"\t");
////					System.out.print(rs.getString("ename")+"\t");
////					System.out.print(rs.getDouble("salary")+"\t");
//					System.out.print(rs.getInt(1)+"\t");
//					System.out.print(rs.getString(2)+"\t");
//					System.out.print(rs.getDouble(3)+"\t");
//					System.out.println();
//				}
				
				while(rs.next())
				{
					for(int i=1;i<=cols;i++)
					{
						System.out.print(rs.getString(i)+"\t");
					}
					System.out.println();
				}
				
				
				
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
