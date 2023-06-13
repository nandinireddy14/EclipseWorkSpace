package cgg.jdbc;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DbDemoCallGetSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
		Class.forName("org.postgresql.Driver");
		String sql="call salaryPro(?,?)";
		try (Connection conn = DriverManager.getConnection(url,username,password);
			CallableStatement cs=conn.prepareCall(sql)
				){
			cs.setInt(1, Integer.parseInt(args[0]));
			
			cs.registerOutParameter(2,Types.NUMERIC);
			
			cs.execute();
			
			BigDecimal result=cs.getBigDecimal(2);
			System.out.println("salary is : "+result);
		}
		
		}
		catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e);
		}
	}

}
