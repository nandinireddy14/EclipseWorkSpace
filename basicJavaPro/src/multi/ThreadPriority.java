package multi;

class MyClass extends Thread
{
	int count;
	MyClass(String s)
	{
		super(s);
	}
	public void run()
	{
		for(int i=0;i<10000;i++)
		{
			count++;
		}
		System.out.println("Completed Thread :"+this.getName());
		System.out.println("Its Priority :"+this.getPriority());
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass t1 = new MyClass("One");
		MyClass t2 = new MyClass("Two");
		
		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		
	}

}
