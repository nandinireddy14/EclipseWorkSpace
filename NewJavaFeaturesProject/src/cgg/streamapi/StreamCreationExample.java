package cgg.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {

	public static void main(String[] args) {
		
		
		//using stream() method of arrays class
		String [] arr= {"abc","def","ghi","jkl"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		
		//using of() method of stream class
		Stream<String> of = Stream.of("abc","def","ghi","jkl");
		System.out.println("--------------------------");
		of.forEach(System.out::println);
		System.out.println("---------------------------");
		
		List<String> list=new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("A",12));
		stuList.add(new Student("B",23));
		stuList.add(new Student("C",22));
		stuList.add(new Student("D",21));
		stuList.add(new Student("E",16));
		stuList.add(new Student("F",22));
		
		
		Stream<Student> stream3 = stuList.stream();
		
		stream3.forEach(System.out::println);
		System.out.println("-------------------------");
		
		Stream<Student> parallelStream = stuList.parallelStream();
		System.out.println("Student data sent for processing");
		
		parallelStream.forEach(s->doProcess(s));
		
	}

	private static void doProcess(Student s) {
		
		System.out.println(s);
	}
//massive amount of data for processing, going for parallelStream is a good option.
//Order of iteration is not maintained.
	//makes use of multithreads as well as multi core processor. 
}
