package cgg.io;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Path file=Paths.get("C:\\Users\\CGG\\Desktop\\ajax\\index.html");
		List<String> lines=Files.readAllLines(file);
		for(String line:lines)
		{
			System.out.println(line);
		}
		System.out.println("End of File..");
		}
		catch(Exception e)
		{
			
		}
	}

}
