package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorComparingExample {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("David",30));
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("barry",35));
		empList.add(new Employee("Martin",30));
		empList.add(new Employee("James",45));
		
		System.out.println("Before Sorting");
		empList.forEach(System.out::println);
		System.out.println("----------------------------------------");
		
		Comparator<Employee> comp = Comparator.comparing(Employee::getName);
		
//		Comparator<Employee> comp = Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER);
		
		Collections.sort(empList,comp);
		
		System.out.println("After Sorting");
		empList.forEach(System.out::println);
	}

}
