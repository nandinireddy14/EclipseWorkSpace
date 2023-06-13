package cgg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="exo1";
		Pattern p=Pattern.compile("^[A-Za-z]*[0-9]$");
		Matcher matcher=p.matcher(input);
		
		if(!matcher.find())
		{
			System.out.println("Enter code that starts with uppercase letter and ends with digit");
		}
	}

}
