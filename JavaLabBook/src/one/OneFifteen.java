package one;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class OneFifteen {

	public static void calculateAge()
	{
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Day");
		int day = sc.nextInt();
		System.out.println("Enter Month");
		int month = sc.nextInt();
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		LocalDate dob = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		
		Period period = dob.until(today);
		System.out.println(period.getYears()+" Years "+period.getMonths()+" Months "+period.getDays()+" Days ");
	}
	public static void main(String[] args) {
	calculateAge();
		
	}

}
