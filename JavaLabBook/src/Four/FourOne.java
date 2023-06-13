package Four;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FourOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader reader=new FileReader("numbers.txt");
		StringBuilder sb=new StringBuilder();
		int val;
		while((val=reader.read())!=-1)
		{
			sb.append((char)val);
		}
		System.out.println(sb);
		sb.reverse();
		FileWriter writer=new FileWriter("write.txt");
		writer.write(sb.toString());
		
		writer.close();
		reader.close();}
		catch(IOException f)
		{
			System.out.println(f.getMessage());
			return;
		}
	
	}

}
