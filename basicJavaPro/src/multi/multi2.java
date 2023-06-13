package multi;
class myThread extends Thread{
	public void run() {
		System.out.println(this.getName());
	}
	
}

public class multi2 {
	public static void main(String[] args) {
		myThread t = new myThread();
		t.start();
	}

}
