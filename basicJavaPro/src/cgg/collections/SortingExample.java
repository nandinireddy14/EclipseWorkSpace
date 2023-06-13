package cgg.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class SortExample {

	public static void main(String[] args) {
		
		ArrayList<Emp> emps = new ArrayList<>();
		
		
		emps.add(new Emp("pqr","12345",12));
		emps.add(new Emp("xyz","56789",10));
		emps.add(new Emp("jkl","79090",18));
		
		System.out.println(emps);
		
//		Collections.sort(emps);
		Collections.sort(emps,new IdComparator());
		System.out.println(emps);
		
		ArrayList<Emp> emps1 = new ArrayList<>(emps);
		
		Collections.sort(emps1, new NameComparator());
		System.out.println(emps1);
		

		
	}

}
