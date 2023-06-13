package one;

import java.util.Scanner;

public class OneTenth {

	public static boolean isPos(String s)
	{
		for(int i=1;i<s.length();i++)
		{
			char ch1=s.charAt(i-1);
			char ch2=s.charAt(i);
			
			if(ch1>ch2) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String str=scan.next();
		boolean res=isPos(str);
		System.out.println(res);

	}

}
