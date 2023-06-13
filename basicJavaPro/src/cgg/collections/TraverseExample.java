package cgg.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("fariha");
		names.add("nandini");
		names.add("divya");
		names.add("sindu");
		System.out.println("---------ITERABLE----------");
		//for each loop
		for(String str:names)
		{
			System.out.print(str+"\t"+str.length()+"\t");
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());
		}
		System.out.println("---------ITERATOR----------");
		//traversing using iterator:forward traversing
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----------LIST ITERATOR------------");
		
		//traversing using listIterator:forward and backward traversing
		
//		ListIterator<String> litr = names.listIterator(names.size());//to hasNext()
		ListIterator<String> litr = names.listIterator(names.size());//to use hasPrevious() one
//		while(litr.hasNext())
//		{
//			System.out.println(litr.next());
//		}
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		System.out.println("-----------FOR EACH---------------");
		
		//for each method
		names.forEach(e->System.out.println(e));
		
		System.out.println("SORTING OF ELEMENTS");
		TreeSet<String> ts=new TreeSet<>();
		ts.addAll(names);
		
//		System.out.println(ts);
		ts.forEach(e->System.out.println(e));
		
	}

}
;