package cgg.debug;

public class ExceptionalBreakpointDemo {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		
		int add=add(num1,num2);
		double divide=divide(num1,num2);
//		System.out.println(add);
//		System.out.println(divide);

	}

	private static int add(int num1, int num2) {
		
		return num1+num2;
	}

	private static double divide(int num1, int num2) {
		
		return num1/num2;
	}

}
