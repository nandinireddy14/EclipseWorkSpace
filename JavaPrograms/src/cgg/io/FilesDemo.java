/**
 * 
 */
package cgg.io;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author CGG
 *
 */
public class FilesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Path path=Path.get("C:\\Users\\CGG");
			DirectoryStream<Path> contents=Files.newDirectoryStream(path);
			for(Path content:contents)
			{
				System.out.println(content.getFileName());
			}
			contents.close();
		}
		catch(Exception e)
		{}
	}

}
