package cgg.defaultandstaticmethods;

import java.util.Collections;
import java.util.List;

public class MyClass implements MyInterface{

	@Override
	public int getMax(List<Integer> intList) {
		Integer max=Collections.max(intList);
		return max;
	}
//default methods can be overridden and default should not be put but static cannot be overridden or implemented.
	
//	@Override
//	public List<Student> sortStudents(List<Student>stuList){
//		return null;
//	}
//	@Override
//	static public void greet(String name)
//	{
//		System.out.println("Welcome : "+name);
//	} static method error
	
}
