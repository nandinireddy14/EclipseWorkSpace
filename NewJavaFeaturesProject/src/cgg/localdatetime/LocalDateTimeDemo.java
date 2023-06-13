package cgg.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("DateTime :"+now);
		
		System.out.println(now.getDayOfMonth());
		System.out.println(now.plusHours(5));
		System.out.println(now.minusDays(10));
		System.out.println(now.getYear());
	}

}
