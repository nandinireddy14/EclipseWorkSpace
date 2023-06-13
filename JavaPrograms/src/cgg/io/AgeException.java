package cgg.io;

import java.util.Scanner;
class Emp
{
	public void getDetails() throws AgeException{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name");
		name=scanner.next();
		System.out.println("Enter age");
		age=scanner.nextInt();
		if(age<16)
			throw new AgeException(age);
	}
}

public class AgeException {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp=new Emp();
		try
		{
			emp.getDetails();
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
	}
	

}
