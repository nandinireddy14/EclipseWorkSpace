package cgg.collections;

import java.util.TreeSet;

public class TreeSetSortExample {

	public static void main(String[] args) {
		TreeSet<Emp> set = new TreeSet<>();

		set.add(new Emp("pqr","12345",12));
		set.add(new Emp("xyz","56789",10));
		set.add(new Emp("jkl","79090",18));

		System.out.println(set);
	}

}
