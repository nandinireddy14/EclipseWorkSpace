
package cgg.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SampleExample{

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Nandini","Reddy",21),
				new Person("Divya","Yalala",22),
				new Person("Fariha","Fathima",22),
				new Person("Yash","Reddy",22)
				);
		//step1 : sort list by lastname
		
		Collections.sort(people, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//step2 : create a method that prints all the elements in the list
		
		System.out.println("Printing all Persons");
		
		printAll(people);
		
		//step3 : create a method that prints all persons beginning with 'S'
		System.out.println("----------------------------------------------");
		System.out.println("Printing all persons with lastname beginning with 'S' ");
		printConditionally(people,p->p.getLastName().startsWith("R"),System.out::println);
		

		//step3 : create a method that prints all persons beginning with 'S'
		System.out.println("----------------------------------------------");
		System.out.println("Printing all persons with firstname beginning with 'N' ");
		printConditionally(people,p->p.getFirstName().startsWith("N"),System.out::println);
		
		printConditionally(people,p->true,System.out::println);
		
	}

	private static void printConditionally(List<Person> persons,Predicate<Person> predicate,Consumer<Person> consumer) {
		for(Person p:persons) {
			if(predicate.test(p)) {
			consumer.accept(p);
			}
		}
		
	}

	private static void printAll(List<Person> persons) {
		for(Person p : persons)
		{
			System.out.println(p);
		}
		
	}
	
	
	
	
}
