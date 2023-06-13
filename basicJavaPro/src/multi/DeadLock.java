package multi;

class BookTicket extends Thread
{
	Object train,comp;
	public BookTicket(Object train,Object comp)
	{
		this.train=train;
		this.comp=comp;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("Book ticket locked on train");
			try {
				Thread.sleep(150);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		System.out.println("Book Ticket waitinf for lock on compartment...");
		synchronized(comp)
		{
			System.out.println("Book Ticket locked on compartment");
		}
		}
	}
}

class CancelTicket extends Thread
{
	Object train,comp;
	public CancelTicket(Object train,Object comp)
	{
		this.train=train;
		this.comp=comp;
	}
	public void run()
	{
		synchronized(comp)//solution train
		{
			System.out.println("Cancel ticket locked on compartment");//locked on train
			try {
				Thread.sleep(150);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		System.out.println("Cancel Ticket waiting for lock on train...");
		synchronized(comp)
		{
			System.out.println("Cancel Ticket locked on train");
		}
		}
	}
}

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object train=new Object();
		Object comp=new Object();
		
		BookTicket bookTicket=new BookTicket(train,comp);
		CancelTicket cancelTicket=new CancelTicket(train,comp);
		
		bookTicket.start();
		cancelTicket.start();
		
	}

}
