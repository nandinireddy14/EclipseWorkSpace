package one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class OneFourteen {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter ZoneID : ");
		Scanner sc = new Scanner(System.in);
		
		String zoneStr = sc.nextLine();
		ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of(zoneStr));
		System.out.println(dateTime);
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//		String zoneStr=reader.readLine();
//		System.out.println(zoneStr);
//		ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of(zoneStr));
//		System.out.println(dateTime);
//		
	}

}
