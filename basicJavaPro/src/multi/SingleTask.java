package multi;

class ThreadTest extends Thread
{
	public void run()
	{
		task1();
		task2();
		task3();
	}

	public void task1() {
		// TODO Auto-generated method stub
		System.out.println("Task1..");
		
	}

	public void task2() {
		// TODO Auto-generated method stub
		System.out.println("Task2..");
	}
	public void task3() {
		// TODO Auto-generated method stub
		System.out.println("Task3..");
	}
}
public class SingleTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest test=new ThreadTest();
		test.start();

	}

}
