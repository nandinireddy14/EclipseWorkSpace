package cgg.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemoInsertByte {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		
		try {
		Class.forName("org.postgresql.Driver");
		String query="insert into attachment(filename,filedata) values(?,?)";
		try(Connection conn = DriverManager.getConnection(url,username,password);
		
		PreparedStatement ps = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS)){
			File file = new File(args[0]);
			String name=file.getName();
			int length=(int)file.length();
			
			ps.setString(1, name);
			
			byte[] data=new byte[length];
			FileInputStream source = new FileInputStream(file);
			try {
			source.read(data,0,length);
			source.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			ps.setBytes(2, data);
			
			
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
