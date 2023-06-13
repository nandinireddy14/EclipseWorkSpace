package cgg.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDemoCreateAddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
		Class.forName("org.postgresql.Driver");
		try (Connection conn = DriverManager.getConnection(url,username,password);Statement stm=conn.createStatement()){
			
			String dropCmd="drop procedure if exists spAddNum";
			String createCmd="create procedure spAddNum(in a int ,in b int,out c int)"+"language plpgsql "+"as $$"+" begin "+" c:= a+b;"+" end; "+"$$";
			

			
			
			stm.execute(dropCmd);
			stm.execute(createCmd);
			
			System.out.println("Procedure Created..");
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
