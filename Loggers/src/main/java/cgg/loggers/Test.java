package cgg.loggers;

public class Test {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		System.out.println("Calling add method");
		c.add(10,10);
		System.out.println("End of add method");
		
		System.out.println("Calling div method");
		c.div(10,10);
		System.out.println("End of div method");
		
		System.out.println("Calling sub method");
		c.sub(10,10);
		System.out.println("End of sub method");

	}

}
