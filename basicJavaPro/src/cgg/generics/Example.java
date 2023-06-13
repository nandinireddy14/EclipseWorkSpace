package cgg.generics;

public class Example {

	public static void main(String[] args) {
//		Box box=new Box("water");
		
//		box.container=123;
//		System.out.println(box.getValue());
//this is not type safe
		
		Box<String> box=new Box<>("water");
//		box.container=123; error
		System.out.println(box.getValue());
		System.out.println(box.container.getClass().getName());		
		
		Box<Integer> box1=new Box<>(123);
		box1.container=234; 
		//box1.container="water"; error
		System.out.println(box1.getValue());
		System.out.println(box1.container.getClass().getName());
		
		Box<Boolean> box2=new Box<>(true);
		System.out.println(box2.getValue());
		System.out.println(box2.container.getClass().getName());
		
		box.performSomeTask();
		box1.performSomeTask();
	}

}
