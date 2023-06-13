package cgg.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fileReader = new FileReader("C:\\Users\\CGG\\eclipse-workspace\\JavaPrograms\\src\\cgg\\io\\names.txt");
			FileWriter fileWriter = new FileWriter("output.txt");
			int i;
			while((i=reader.read())!=-1)
			{
				writer.write(i);
			}
			writer.close();
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
