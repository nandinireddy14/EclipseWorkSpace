package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbDemoCommit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
			Class.forName("org.postgresql.Driver");
//			String cmd="delete from emp where empid=?";
			String cmd="update emp set salary=70000 where empid=?";
			try(Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement ps = conn.prepareStatement(cmd)){
				
				conn.setAutoCommit(false);
				
				ps.setInt(1, Integer.parseInt(args[0]));
				
				int count=ps.executeUpdate();
				
				if(count>0) {
//					System.out.println("employee deleted");
					System.out.println("Update successfull");
				}
				else
				{
					System.out.println("no such employee");
				}
//				conn.commit();
//				conn.rollback();
				System.out.println("Transaction commited");
			conn.setAutoCommit(true);
			}
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			
		}
	}

}
