package cgg.regex;

import java.util.regex.Pattern;
public class RegExClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr="Test String";
		String pattern="Test String";
		
		boolean matches=Pattern.matches(pattern, inputStr);
		System.out.println(matches);

	}

}
