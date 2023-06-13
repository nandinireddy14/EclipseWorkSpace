package multi;

public class multithreading1 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current thread = "+t);
		System.out.println(t.getName());

	}

}
