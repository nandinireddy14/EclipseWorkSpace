package cgg.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> courses=new HashMap<>();
		
//		//adding elements
		courses.put("Core Java", 4000);
		courses.put("Basic Python", 3500);
		courses.put("Spring Boot", 8000);
		courses.put("Android", 4000);
		courses.put("Hibernate", 8000);
		courses.put("Android", 6000);
		courses.put("PHP",2000);
		
		System.out.println(courses);
		System.out.println("--------------FOR EACH--------------");
		courses.forEach((k,v)->System.out.println(k+" : "+v));
		
//		System.out.println(courses.get("PHP"));
		
		System.out.println("--------------BEFORE JAVA 8 ITERATION--------------");
		
//		Set<String> keySet = courses.keySet();
		Set set = courses.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
//			Map.Entry<K, V> me=(Map.Entry<K, V>)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		int fees=courses.get("Core Java");
		int newFees=fees+1000;
		//updating a value
		courses.put("Core Java", newFees);
		System.out.println(courses.get("Core Java"));
		System.out.println("--------------FOR EACH--------------");
		courses.forEach((k,v)->System.out.println(k+" : "+v));
	}

}
