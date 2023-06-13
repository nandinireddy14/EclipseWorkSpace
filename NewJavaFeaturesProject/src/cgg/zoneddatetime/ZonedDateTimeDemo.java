package cgg.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println("Time in India :"+now);
		
		ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Time in Paris :"+now2);
		
		ZonedDateTime of = ZonedDateTime.of(2023, 5,3,4,30,30,320, ZoneId.of("America/Chicago"));
		System.out.println(of);

	}

}
