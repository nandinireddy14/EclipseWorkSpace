package cgg.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceExample {

	public static void main(String[] args) {	
	List<Integer> asList = Arrays.asList(1,2,3,4,5);
	Integer reduce = asList.stream().reduce(0,(a,b)->a+b);
	System.out.println(reduce);
	
	System.out.println("-------------------------------------");
	
	List<String> names = new ArrayList<String>();
	names.add("abc");
	names.add("def");
	names.add("ghi");
	names.add("klm");
	names.add("nop");
	
	List<String> collect = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
	System.out.println(collect);
	}

}
