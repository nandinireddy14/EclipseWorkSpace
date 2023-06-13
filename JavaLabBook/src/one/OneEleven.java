package one;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OneEleven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day");
		int day = sc.nextInt();
		System.out.println("Enter Month");
		int month = sc.nextInt();
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		LocalDate acceptedDate = LocalDate.of(year, month, day);
		LocalDate sysDate = LocalDate.now();
		
		Period period = acceptedDate.until(sysDate);
		
		System.out.println("Days : "+period.get(ChronoUnit.DAYS));
		System.out.println("Month : "+period.getMonths());
		System.out.println("Years : "+period.getYears());

	}

}
