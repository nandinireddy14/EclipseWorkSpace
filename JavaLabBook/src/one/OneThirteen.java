package one;

import java.time.LocalDate;
import java.util.Scanner;

public class OneThirteen {
	public static void calculateDate()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Purchase Date : ");
		System.out.println("Enter Day");
		int day1 = sc.nextInt();
		System.out.println("Enter Month");
		int month1 = sc.nextInt();
		System.out.println("Enter Year");
		int year1 = sc.nextInt();
		
		LocalDate purchasedDate = LocalDate.of(year1, month1, day1);
		
		System.out.println("Enter Warranty Period : ");
		System.out.println("Enter Month");
		int month2 = sc.nextInt();
		System.out.println("Enter Year");
		int year2 = sc.nextInt();
		
		LocalDate plus = purchasedDate.plusYears(year2).plusMonths(month2);
		System.out.println(plus);
	}

	public static void main(String[] args) {
		

		
		calculateDate();
	}

}
