package cgg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemoCreateGetSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
		Class.forName("org.postgresql.Driver");
		try (Connection conn = DriverManager.getConnection(url,username,password);Statement stm=conn.createStatement()){
			
			String dropCmd="drop procedure if exists salaryPro";
			String createCmd="create procedure salaryPro(in p_empid int,out p_sal numeric(12,2))"+"language plpgsql as $$"+" begin "+
			" select salary into p_sal from emp where empid= p_empid;"
			+" end; $$";
			

			
			
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
