package multi;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class WriterThreadtwr extends Thread
{
	PipedOutputStream dest;
	public WriterThreadtwr(PipedOutputStream dest)
	{
		this.dest=dest;
	}
	
	public void run()
	{
		byte [] data ="I like Java".getBytes();
		try {
		for(int i=0;i<data.length;i++)
		{
			
				dest.write(data[i]);
			}
		}
			catch(IOException e){
				e.printStackTrace();
				
			}
		finally {
			System.out.println("hii");
			
		}
}
		}


class ReaderThreadtwr extends Thread
{
	PipedInputStream source;
	public ReaderThreadtwr(PipedInputStream source)
	{
		super();
		this.source=source;
	}
	
	public void run()
	{
		try {
			int r=source.read();
			while(r!=-1)
			{
				System.out.write(r);
				r=source.read();
			}
			System.out.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("hii");
			
		}

	}
}
public class TryWithResourceThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(PipedOutputStream dest=new PipedOutputStream();
			PipedInputStream source=new PipedInputStream();) {
			
			dest.connect(source);
			
			WriterThreadtwr writerThread=new WriterThreadtwr(dest);
			ReaderThreadtwr readerThread=new ReaderThreadtwr(source);
			
			writerThread.start();
			readerThread.start();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
