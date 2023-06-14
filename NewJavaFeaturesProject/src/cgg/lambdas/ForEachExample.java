package cgg.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Nandini","Reddy",21),
				new Person("Divya","Yalala",22),
				new Person("Fariha","Fathima",22),
				new Person("Yash","Reddy",22)
				);
		
		//external iterators controlled by programmers - slow
		System.out.println("Iterating using loop");
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("Iterating using for in loops");
		for(Person person : people)
		{
			System.out.println(person);
		}
		
		
		//internal iterators--controlled by JVM possible can exeecute in parallel also
		System.out.println("------------------------------------------------");
		System.out.println("Iterating using lambda");
		people.forEach(p->System.out.println(p));
		
		System.out.println("-------------------------------------------------");
		System.out.println("Iterating using method refrence");
		people.forEach(System.out::println);
	}

}
