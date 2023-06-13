package cgg.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate tfd = LocalDate.of(2014, Month.JUNE, 2);
		System.out.println("Telanagana Formation Day "+tfd);
		
		System.out.println("2 Days added to today :"+today.plusDays(2));
		
		System.out.println("3 months minus to today :"+today.minusMonths(3));
		
		System.out.println("2 weeks added to today :"+today.plusWeeks(2));
		
		System.out.println("checking if leap year :"+tfd.isLeapYear());
		
		System.out.println("Move to 30th day of month :"+today.withDayOfMonth(30));
		
		System.out.println("Day of Year :"+today.withDayOfYear(20));
		

		

	}

}
