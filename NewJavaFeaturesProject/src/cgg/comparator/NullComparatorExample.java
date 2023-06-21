package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NullComparatorExample {
public static void main(String[] args) {
	ArrayList<Employee> empList = new ArrayList<Employee>();
	empList.add(new Employee("David",30));
	empList.add(new Employee("Martin",40));
	empList.add(new Employee(null,40));
	empList.add(new Employee("Alice",23));
	empList.add(new Employee("Martin",25));
	empList.add(new Employee(null,32));
	empList.add(new Employee("barry",35));
	empList.add(new Employee(null,34));
	empList.add(new Employee("Martin",30));
	empList.add(new Employee("James",45));
	
	System.out.println("Before Sorting");
	empList.forEach(System.out::println);
	System.out.println("----------------------------------------");
	
	Comparator<Employee> comp = Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));
	Collections.sort(empList,comp);
	System.out.println("After Sorting");
	empList.forEach(System.out::println);
}
}
