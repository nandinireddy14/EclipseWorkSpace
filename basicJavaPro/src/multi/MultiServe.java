package multi;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServe implements Runnable{
	static ServerSocket ss;
	static Socket s;
	public void run()
	{
		String name=Thread.currentThread().getName();
		for(;;)
		{
			System.out.println("thread :"+name+"ready to accept");
			try {
				s=ss.accept();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}System.out.println("Thread "+name+"accepted connection");
			
			
			//for sending msgs
			PrintStream ps=null;
			try {
				ps=new PrintStream(s.getOutputStream());
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			ps.println("thread"+name+"contacted you");
			ps.close();
			try {
				s.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		ss=new ServerSocket(999);
		// TODO Auto-generated method stub
		MultiServe m1=new MultiServe();
		
	
		Thread t1 = new Thread(m1,"one");
		Thread t2 = new Thread(m1,"two");
		
		t1.start();
		t2.start();
	}

}
