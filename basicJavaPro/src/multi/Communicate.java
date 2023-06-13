package multi;

class Producer extends Thread
{
	StringBuffer sb;
	boolean dataprodover;
	public Producer() {
		sb=new StringBuffer();
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sb.append(i+" ");
				Thread.sleep(100);
				System.out.println("Appending..");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		dataprodover=true;
	}
}

class Consumer extends Thread{
	Producer prod;
	public Consumer(Producer prod)
	{
		this.prod=prod;
	}
	public void run()
	{
		try {
			while(!prod.dataprodover)
			{
				Thread.sleep(10);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(prod.sb);
	}
}

public class Communicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);
		
		consumer.start();
		producer.start();
		

	}

}
