package cgg.jdbc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbDemoSelectBlob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/cgg_interns";
		String username="postgres";
		String password="nandini14";
		try {
			Class.forName("org.postgresql.Driver");
			String query="select filename,filedata from attachment where id = ?";
			try(Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement ps = conn.prepareStatement(query)){
				ps.setInt(1, Integer.parseInt(args[0]));
				
				ResultSet rs=ps.executeQuery();
				
				String saveDir="./temp/blob";
				
				while(rs.next())
				{
					String fileName=rs.getString("filename");
					File file = new File(saveDir,fileName);
					FileOutputStream fos=new FileOutputStream(file);
					
					Blob blob=rs.getBlob("filedata");
					
					byte[] bytes=blob.getBytes(1,(int)blob.length());
				
					fos.write(bytes);
					fos.flush();
					fos.close();
					
					System.out.println("File saves at: "+file.getCanonicalPath());
					
				}
			}
		}
		catch(ClassNotFoundException|SQLException|IOException e)
		{
			System.out.println(e);
		}
	}

}
