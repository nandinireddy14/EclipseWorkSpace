package cgg.debug;

public class ConditionalBreakPointDemo {

	public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		findPower(2,i);
	}

	}

	private static void findPower(int i, int i2) {
		System.out.println("value of i is : "+i);
		double pow = Math.pow(i, i2);
		Math.pow(i, i2);
		System.out.println(i+" is raised to "+i2+" is : "+pow);
		System.out.println("------------------------");
		
	}

}
