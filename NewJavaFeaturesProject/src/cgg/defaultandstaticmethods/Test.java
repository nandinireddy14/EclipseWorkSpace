package cgg.defaultandstaticmethods;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		MyInterface mi=new MyClass();
		
		ArrayList<Student> arrayList=new ArrayList<Student>();
		arrayList.add(new Student("XYZ",20));
		arrayList.add(new Student("ABC",10));
		
		List<Student> students=mi.sortStudents(arrayList);
		for(Student stu:students)
		{
			System.out.println(stu.getName()+"\t"+stu.getAge());
		}
		System.out.println("-----------------------------");
		
		MyInterface.greet("Nandu");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(30);
		list.add(1350);
		list.add(40);
		System.out.println("------------------------------");
		
		int max = mi.getMax(list);
		System.out.println(max);
		
	}

}
