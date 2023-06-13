/**
 * 
 */
package cgg.io;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;

/**
 * @author CGG
 *
 */

class Student implements Serializable{
	private int rollno;
	private String sname;
	public Student (int rollno,String sname)
	{
		super();
		this.rollno=rollno;
		this.sname=sname;
	}
	public String toString()
	{
		return "Rollno:"+rollno+"Student name is :"+sname;
	}
}
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream writer=new FileOutputStream("student.dat");
			ObjectOutputStream oos=new ObjectOutputStream(writer);
			Student s1=new Student(12,"ABC");
			System.out.println("Student Object S1: "+s1);
			
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			
			Student s2;
			FileInputStream fis=new FileInputStream("student.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s2=(Student)ois.readObject();
			System.out.println("Student Object S2: "+s2);
			ois.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
