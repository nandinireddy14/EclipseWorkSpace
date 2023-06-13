package cgg.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();//type safe
		list.add("hi");
		String str="hello";
		list.add(str);
		list.add(str+str);
		list.add("1");
		list.add("1");
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
//		list.remove(str);
		
		System.out.println("Size : "+list.size());
		//check for empty
		System.out.println(list.isEmpty());
		//setting value
		System.out.println(list);
		list.set(1,"welcome");
		list.add(2, "hey");
//		list.clear();//remove all elements
//		System.out.println(list.contains(42));
//		System.out.println(list.contains("hi"));
//		System.out.println(list.remove("hello"));
		System.out.println(list);
		
		//type unsafe
		
//		LinkedList ll=new LinkedList();
//		
//		ll.add("abc");
//		ll.add(1);
//		ll.add(234.56);
//		ll.add(false);
//		
//		System.out.println(ll);
		System.out.println("--------------------------------");	
		List<String> vector = new Vector<>();
		vector.addAll(list);
		System.out.println(vector);
		
		
		System.out.println("--------------------------------");
		HashSet<Double> hset=new HashSet<>();
		hset.add(1234.545);
		hset.add(123.1);
//		hset.add(new Double(45.5));
		hset.add(14.45);
		hset.add(123.1);
		System.out.println("HashSet: "+hset);
		
		System.out.println("--------------------------------");
		Set<Double> ts=new TreeSet<>();
		ts.addAll(hset);
		System.out.println(ts);
		System.out.println("--------------------------------");
		
		Set<Double> lhset=new LinkedHashSet<>();
		lhset.add(123.4);
		lhset.add(3.4);
		lhset.add(1223.4);
		lhset.add(155.4);
		System.out.println(lhset);
		
	}

}
