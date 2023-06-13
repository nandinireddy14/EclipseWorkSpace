package cgg.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DbDemoInsertResultSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		
		try {
			
			Class.forName("org.postgresql.Driver");
			String query="select * from emp;";
			try(Connection conn=DriverManager.getConnection(url,username,password);
					PreparedStatement stm = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					
				ResultSet rs = stm.executeQuery();
				ResultSetMetaData rm=rs.getMetaData();
				
				DatabaseMetaData dm = conn.getMetaData();
				boolean b=dm.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE);
				System.out.println(b);
				
				int cnt=rm.getColumnCount();
				int noofrows=1;
				while(rs.next())
				{
					for(int i=1;i<=cnt;i++)
					{
						System.out.print(rs.getString(i)+"\t");
					}
					System.out.println();
				}
				noofrows++;
				if(noofrows==2)
				{
					try {
						Thread.sleep(2000);
					}
					finally {
						
					}
				}
				System.out.println("row inserted");
			}
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
	}

}
