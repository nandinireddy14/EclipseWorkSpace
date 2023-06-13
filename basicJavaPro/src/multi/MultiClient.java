package multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.net.*;


public class MultiClient {

	public static void main(String[] args) throws UnknownHostException , IOException{
		// TODO Auto-generated method stub
		Socket s1=new Socket("localhost",999);
		BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
		
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
		s1.close();
		
	}

}
