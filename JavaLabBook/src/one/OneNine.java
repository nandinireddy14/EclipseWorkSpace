package one;
import java.util.*;
public class OneNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Add string to itself 2.replace odd positions with # 3.remove duplicate characters in string 4.change odd characters to uppercase:");

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=scan.next();
		System.out.println("Enter option:");
		int op=scan.nextInt();
		switch(op) {
		case(1):
		{
			System.out.println(s+s);
			break;
		}
		case(2):
		{
			String c="";
			for(int i=0;i<s.length();i++)
			{
				if(i%2!=0)
				{
					c=c+"#";
					continue;
				}
				c=c+s.charAt(i);
			}
			System.out.println(c);
			break;
		}
		case(3):
		{
			String c="";
			
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(!c.contains(Character.toString(ch)))
				{
					c=c+ch;
				}
				else {
					continue;
				}
			}
			System.out.println(c);
			break;
		}
		case(4):
		{
			String c="";
			for(int i=0;i<s.length();i++)
			{
				if(i%2!=0)
				{
					char ch=s.charAt(i);
					c=c+Character.toString(ch).toUpperCase();
					continue;
				}
				c=c+s.charAt(i);
			}
			System.out.println(c);
			break;
		}
		default:
			System.out.println("Enter a Valid number");
		}
	}

}
