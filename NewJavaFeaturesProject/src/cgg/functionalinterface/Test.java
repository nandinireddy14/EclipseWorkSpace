package cgg.functionalinterface;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

//		createThreadUsingAnonymousClass();
//		createThreadUsingLambda();

//		createCustomLambda();
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Delhi");
		list.add("Hyderabad");
		list.add("Chennai");
		list.add("Banglore");
//		list.forEach(n->System.out.println(n));
		list.forEach(System.out::println);
	}

	private static void createCustomLambda() {

		// defining lambda
//		MyInterface i = () -> System.out.println("Testing lambda");
		
		MyInterface i=name->{System.out.println(name);};

		// invoking lambda
//		i.method1();
		i.method1("Nandini");

	}

//	private static void createThreadUsingLambda() {
//		
//		//lambda expressions
//		Runnable rt = ()->{
//			System.out.println("Iam Runnable");
//			
//			
//		};
//		Thread thread = new Thread(rt);
//		thread.start();
//		
//	}

//	private static void createThreadUsingAnonymousClass() {
//		//anonymous class
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Iam a Thread my task is executing..");
//				
//			}
//			
//		};
//		Thread thread = new Thread(r);
//		thread.start();
//	}

}
