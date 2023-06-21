package cgg.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingIntExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Carter","James","Davis","Zorra","Barry","Zola");
		
		System.out.println("Before Sorting");
		list.forEach(System.out::println);
		System.out.println("----------------------------------------");

		Comparator<String> comp = Comparator.comparingInt(String::length);
		
		Collections.sort(list,comp);
		
		System.out.println("After Sorting");
		list.forEach(System.out::println);
		
	}

}
