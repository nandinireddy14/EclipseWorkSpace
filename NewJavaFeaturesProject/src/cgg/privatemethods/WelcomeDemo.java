package cgg.privatemethods;

public class WelcomeDemo implements Welcome {

	public static void main(String[] args) {
		WelcomeDemo demo = new WelcomeDemo();
		demo.hi();
		demo.greet();
//		demo.test();
	}

//	private void test() {
//		System.out.println("test");
//		
//	}

	@Override
	public void hi() {
		System.out.println("hi");
		
	}

}
