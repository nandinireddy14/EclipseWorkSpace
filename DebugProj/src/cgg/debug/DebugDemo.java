package cgg.debug;

import java.util.Iterator;

public class DebugDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		int a=10;
		System.out.println("value of a: "+a);
		a=a+1;
		stepinto();
		System.out.println("Value of a: "+a);
		System.out.println("For loop started: ");
		for (int i = 0; i < 6; i++) {
			if(a>30)
			{
				System.out.println("a value is greater than 30");
			}
			a=a+1;
			System.out.println("value of a:"+a);
		}
		System.out.println("End");
	}

	private static void stepinto() {
		System.out.println("entered into new method");
		int b=10;
		System.out.println("value of b: "+b);
		b=b+2;
		show();
		System.out.println("value of b: "+b);
	}
	
	private static void show()
	{
		int c=3;
		System.out.println("value of c: "+c);
		c=c+1;
		System.out.println("value of c: "+c);
	}
}
//3 ways of setting breakpoints
//double click on the line
//right click->Toggle breakpoint
//ctrl+shift+b