package cgg.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		//advantage of generics is type safety errors are caught at compile time
		ArrayList<Integer> list = new ArrayList<>();
//		list.add("hi");
		list.add(1);
		
		//type is object class
		List alist = new ArrayList();
		alist.add("hello");
		alist.add(1);
		alist.add(12.34);
		alist.add(true);
		
		System.out.println(list);
		System.out.println(alist);
		
	}
	
}
