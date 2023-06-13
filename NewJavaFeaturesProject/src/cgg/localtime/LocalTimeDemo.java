package cgg.localtime;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime tt= LocalTime.now();
		System.out.println(tt);
		
		LocalTime of = LocalTime.of(11, 20);
		
		System.out.println("added 2 hours to tt : "+tt.minusHours(2));
		
		System.out.println("added 10 minutes to tt: "+tt.plusMinutes(10));
		
		System.out.println("Time :"+of);
		
		System.out.println("Move to 2 hour :"+tt.withHour(2));
		
		System.out.println("is tt before of ? : "+tt.isBefore(of));
		System.out.println("is tt after of ? : "+tt.isAfter(of));

	}

}
