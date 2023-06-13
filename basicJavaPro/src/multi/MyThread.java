package multi;

public class MyThread extends Thread {
	
	public MyThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		System.out.println("Thread name "+getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread=new MyThread("First Thread");
		thread.start();
		
		MyThread thread1=new MyThread("Second Thread");
		thread1.start();
		
		boolean alive=thread.isAlive();
		System.out.println("First Thread is alive "+alive);
		
		alive=thread1.isAlive();
		System.out.println("Second Thread is alive "+alive);
		
		thread.join();
		thread1.join();
		
		System.out.println("Main Ends");

	}

}
