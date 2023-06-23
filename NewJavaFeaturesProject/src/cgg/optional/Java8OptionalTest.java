package cgg.optional;

import java.util.Optional;

public class Java8OptionalTest {

	public static void main(String[] args) {
		Integer val1=null;
		Integer val2=18;
		
		Optional<Integer> a = Optional.ofNullable(val1);
		Optional<Integer> b = Optional.of(val2);
		
		Integer sum=sum(a,b);
		System.out.println(sum);
	}

	private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First Parameter is Present : "+a.isPresent());
		System.out.println("Second Parameter is Present : "+b.isPresent());
		
		Integer val1=a.orElse(0);
		Integer val2=b.get();
		return val1+val2;
	}

}
