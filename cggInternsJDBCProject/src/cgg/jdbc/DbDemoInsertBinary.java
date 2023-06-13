package cgg.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemoInsertBinary {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
		Class.forName("org.postgresql.Driver");
		String cmd="insert into attachment(filename,filedata) values(?,?)";
		try(Connection conn = DriverManager.getConnection(url,username,password);
		
		PreparedStatement ps = conn.prepareStatement(cmd,Statement.RETURN_GENERATED_KEYS)){
			File file = new File(args[0]);
			String name=file.getName();
			long length=file.length();
			
			ps.setString(1, name);
			
			FileInputStream fis = new FileInputStream(file);
			
			ps.setBinaryStream(2,fis,length);
			
			int cnt=ps.executeUpdate();
			
			if(cnt>0)
			{
				System.out.println(cnt+" row(s) inserted");
				ResultSet keys = ps.getGeneratedKeys();
				keys.next();
				int generatedKey = keys.getInt(1);
				System.out.println(" Id added "+generatedKey) ;
				keys.close();
				
			}
		}
		}
		catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e);
		}
	}

}
