package cgg.comparator;

import java.util.ArrayList;

public class ListComparatorExample {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("David",30));
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("Barry",35));
		empList.add(new Employee("Martin",30));
		empList.add(new Employee("James",45));
		
		System.out.println("Before Sorting");
		empList.forEach(System.out::println);
		
		empList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println("After Sorting");
		empList.forEach(System.out::println);
		

	}

}
