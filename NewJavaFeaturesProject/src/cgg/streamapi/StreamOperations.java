package cgg.streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("CC");
		list.add("AA");
		
//		Stream<String> stream = list.stream();//intermediate operation
//		Stream<String> distinct = stream.distinct();//intermediate operation
//		long count = distinct.count();//terminal operation
		
		long count = list.stream().distinct().count();
		System.out.println(count);
		
		//streams cannot be reused
		
		boolean match = list.stream().anyMatch(ele->ele.contains("F"));
		System.out.println(match);
		
		System.out.println("-----------------------------------");
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("A",12));
		stuList.add(new Student("B",23));
		stuList.add(new Student("C",22));
		stuList.add(new Student("D",30));
		stuList.add(new Student("E",40));
		stuList.add(new Student("F",22));
		
		Stream<Student> filteredList= stuList.stream().filter(s->s.getAge()>25);
		filteredList.forEach(System.out::println);
		System.out.println("--------------------------------------");
		
		boolean allMatch = stuList.stream().allMatch(s->s.getName().contains("A"));
		System.out.println(allMatch);
		boolean anyMatch = stuList.stream().anyMatch(s->s.getAge()>35);
		System.out.println(anyMatch);
		boolean noneMatch = stuList.stream().noneMatch(e->e.getName().contains("C"));
		System.out.println(noneMatch);
		System.out.println("---------------------------------------");
		
		
		
	}

}
