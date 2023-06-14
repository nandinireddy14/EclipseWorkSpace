package cgg.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		Runnable r=()->System.out.println("My task is running");
		Runnable r=MethodReferenceExample::myRun;
		executorService.execute(r);
		
		
		List<Integer> nums = Arrays.asList(4,7,33,99,6,67);
		nums.forEach(System.out::println);
		List<Double> findSquareRoots =MethodReferenceExample.findSquareRoots(nums,Double::new);
		findSquareRoots.forEach(System.out::println);
		
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person("ABC",30));
		persons.add(new Person("DEF",20));
		persons.add(new Person("GHI",10));
		persons.add(new Person("JKL",30));
		
		List<String> personName=MethodReferenceExample.getPersonName(persons,Person::getName);
		//p->p.getName()
		persons.forEach(System.out::println);
		
		System.out.println("--------------------");
//		PersonManager pm=()->new Person();
		PersonManager pm=Person::new;
		System.out.println(pm.getPerson().getPersonInfo());

	}
	private static List<String> getPersonName(List<Person> persons,Function<Person,String> f){
		List<String> result=new ArrayList<String>();
		persons.forEach(p->result.add(f.apply(p)));
		return result;
	}
	
	private static List<Double> findSquareRoots(List<Integer> nums, Function<Integer,Double> f) {
		ArrayList result = new ArrayList<Double>();
		nums.forEach(x->result.add(Math.sqrt(f.apply(x))));
		return result;
	}
	private static void myRun()
	{
		System.out.println("My task is running..");
	}

}
