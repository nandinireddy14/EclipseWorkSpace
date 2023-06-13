package multi;

class Reservation extends Thread{
	
	public Reservation(ThreadGroup tg,String s)
	{
		super(tg,s);
	}
	
	public void run()
	{
		System.out.println("Iam Reservation Thread");
	}
}
class Cancellation extends Thread{
	
	public Cancellation(ThreadGroup tg,String s)
	{
		super(tg,s);
	}
	
	public void run() {
		System.out.println("Iam Cancellation Thread");
	}
}

public class TGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg = new ThreadGroup("First Group");
		
		Reservation res=new Reservation(tg,"First res Thread");
		Reservation res1=new Reservation(tg,"Second res Thread");
		
		
		ThreadGroup tg1 = new ThreadGroup(tg,"Second Group");
		Cancellation can = new Cancellation(tg1,"First can Thread");
		Cancellation can1 = new Cancellation(tg1,"Second can Thread");
	
		//parent group of tg1
		
		System.out.println("Parent of tg1 : "+tg1.getParent());
		
		
		//set max priority of tg1 as 7
		
		tg1.setMaxPriority(7);
		
		//know the thread group of res and can
		System.out.println("Thread Group of First Thread : "+res.getThreadGroup());
		System.out.println("Thread Group of Third Thread : "+can.getThreadGroup());
		
		res.start();
		res1.start();
		can.start();
		can1.start();
		
		System.out.println("No of threads active in tg "+tg.activeCount());
		System.out.println("No of threads active in tg1 "+tg1.activeCount());
		
	}

}
