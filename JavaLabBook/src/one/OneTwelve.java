package one;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class OneTwelve {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date1 Day");
		int day1 = sc.nextInt();
		System.out.println("Enter Date1 Month");
		int month1 = sc.nextInt();
		System.out.println("Enter Date1 Year");
		int year1 = sc.nextInt();
		
		LocalDate Date1 = LocalDate.of(year1, month1, day1);
		
		System.out.println("Enter Date2 Day");
		int day2 = sc.nextInt();
		System.out.println("Enter Date2 Month");
		int month2 = sc.nextInt();
		System.out.println("Enter Date2 Year");
		int year2 = sc.nextInt();
		
		LocalDate Date2 = LocalDate.of(year2, month2, day2);
		
		Period period = Date1.until(Date2);
		
		System.out.println("Days : "+period.getDays()+" Months : "+period.getMonths()+" Years : "+period.getYears());

	}

}
