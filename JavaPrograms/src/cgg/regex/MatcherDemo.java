package cgg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Shop.Mop.Hopping.Chopping";
		Pattern pattern=Pattern.compile("hop");
		Matcher matcher=pattern.matcher(input);
		
		System.out.println(matcher.matches());
		while(matcher.find())
		{
			System.out.println(matcher.group()+":"+matcher.start()+":"+matcher.end());
		}
	}

}
