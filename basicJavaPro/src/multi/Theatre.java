package multi;

public class Theatre implements Runnable
{
	String str;
	public Theatre(String str)
	{
		super();
		this.str=str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++)
		{
			System.out.println(str+" "+i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre=new Theatre("Cut the Ticket");
		Theatre theatre1=new Theatre("Show the seat");
		
		Thread  t1=new Thread(theatre);
		Thread t2=new Thread(theatre1);
		
		t1.start();
		t2.start();

	}
	
}
