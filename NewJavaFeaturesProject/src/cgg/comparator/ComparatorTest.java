package cgg.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

	public static void main(String[] args) {
	ArrayList<Employee> empList = new ArrayList<Employee>();
	empList.add(new Employee("David",30));
	empList.add(new Employee("Alice",23));
	empList.add(new Employee("Barry",35));
	empList.add(new Employee("Martin",30));
	empList.add(new Employee("James",45));
	
	System.out.println("Before sorting");
	for(Employee e:empList)
	{
		System.out.println(e);
	}
	
	Collections.sort(empList, (e1,e2)->e1.getName().compareTo(e2.getName()));
	
	System.out.println("After sorting");
	for(Employee e:empList)
	{
		System.out.println(e);
	}
	}

}
