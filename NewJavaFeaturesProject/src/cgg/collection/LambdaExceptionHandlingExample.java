package cgg.collection;

import java.util.Arrays;
import java.util.List;

import java.util.function.Consumer;
public class LambdaExceptionHandlingExample {
	public static void main(String[] args) {
//	List<Integer> integers = Arrays.asList(3,6,5,4,9,7,20);
		List<Integer> integers = Arrays.asList(3, 6, 5, 0, 4, 9, 7, 20);
//		integers.forEach(i -> {
//			try {
//				System.out.println(50 / i);
//			} catch (ArithmeticException e) {
//				System.out.println("Arithmetic Exception Occured: "+e.getMessage());
//			}
//
//		});
		
		integers.forEach(lambdaWrapper(i->System.out.println(50/i),Exception.class));
	}
//	private static Consumer<Integer> lambdaWrapper(Consumer <Integer> consumer){
//		return i->{
//			try {
//				consumer.accept(i);
//			}
//			catch(ArithmeticException e)
//			{
//				System.out.println("Arithmetic Exception Occured: "+e.getMessage());
//			}
//		};
//	}
	
	//generic
	private static <T,E extends Exception> Consumer<T> lambdaWrapper(Consumer <T> consumer,Class<E> c){
	return i->{
		try {
			consumer.accept(i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occured: "+e.getMessage());
		}
	};
}
}
