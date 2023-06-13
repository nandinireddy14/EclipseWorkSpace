package cgg.io;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LineNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		try {
			FileReader reader=new FileReader("C:\\Users\\CGG\\eclipse-workspace\\JavaPrograms\\src\\cgg\\io\\names.txt");
			BufferedReader br=new BufferedReader(reader);
			LineNumberReader lr=new LineNumberReader(br);
			while((s=lr.readLine())!=null)
			{
				System.out.println(lr.getLineNumber()+" "+s);
			}
			lr.close();
			br.close();
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}

}
