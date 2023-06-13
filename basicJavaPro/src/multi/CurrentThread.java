package multi;

public class CurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Thread");
		Thread currentThread=Thread.currentThread();
		System.out.println("Currrent Thread : "+currentThread);
		System.out.println("Currrent Thread : "+currentThread.getName());
	}

}
