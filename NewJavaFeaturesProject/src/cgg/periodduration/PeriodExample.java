package cgg.periodduration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2014, Month.JUNE, 2);
		LocalDate end = LocalDate.now();
		
		Period period = start.until(end);
		
		System.out.println("Days : "+period.get(ChronoUnit.DAYS));
		System.out.println("Months : "+period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+period.get(ChronoUnit.YEARS));
		
		System.out.println("Days : "+period.getDays());
		System.out.println("Months : "+period.getMonths());
		System.out.println("Years : "+period.getYears());
		
		System.out.println("-----------------------------------------------");
		
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(period.ofDays(5));
		
		int days = period.between(initialDate, finalDate).getDays();
		
		System.out.println(days+" days");
		long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(between+" days");
		
		LocalDate bdy = LocalDate.of(2002,Month.JUNE, 14);
		Period p = Period.between( bdy,initialDate);
		long p1 = ChronoUnit.DAYS.between(
				bdy,initialDate);
		
		System.out.println("You are "+p+" years old");
		System.out.println("You are "+p1+" years old");
		
		//to calculate next birthday
		
		LocalDate nextbdy = bdy.withYear(initialDate.getYear());
		//if your bdy has occured this year already,add 1 to the year
		if(nextbdy.isBefore(initialDate)||nextbdy.isEqual(initialDate))
		{
			nextbdy=nextbdy.plusYears(1);
		}
		
		p = Period.between( initialDate,nextbdy);
		p1=ChronoUnit.DAYS.between( initialDate,nextbdy);
		System.out.println("There are "+p.getMonths()+" months and "+p.getDays()+" days until your next birthday ( "+p1+" total )");
		
		System.out.println("----------------------------------------------------------");
		
		LocalTime initialTime = LocalTime.of(6, 30,0);
		
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		
		long seconds = Duration.between(initialTime, finalTime).getSeconds();
		
		System.out.println(seconds+" seconds");
		System.out.println(ChronoUnit.SECONDS.between(initialTime, finalTime)+" seconds");
		
		System.out.println("-----------------------------------------------------------");
		
		//Date and Time formatting
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		LocalDate currentDate = LocalDate.now();
		
		System.out.println(currentDate.format(formatter));
		
		System.out.println("-------------------------------------------------------------");

		DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime.format(timeFormatter));
		
		System.out.println("----------------------------------------------------------------");
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String text="14/06/2002";
		LocalDate date = LocalDate.parse(text,pattern);
		System.out.println(date);
		
		DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("HH-mm-ss");
		String text1="13-06-39";
		LocalTime time = LocalTime.parse(text1, pattern1);
		System.out.println(time);
		
	}

}
