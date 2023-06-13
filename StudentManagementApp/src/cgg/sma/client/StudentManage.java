package cgg.sma.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cgg.sma.dao.StudentDAO;
import cgg.sma.model.Student;

public class StudentManage {
	
	static StudentDAO studentDAO=new StudentDAO();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to UPDATE Student");
			System.out.println("Press 3 to DELETE Student");
			System.out.println("Press 4 to DISPLAY ALL Students");
			System.out.println("Press 5 to EXIT");
			
			System.out.println("Enter your choice: ");
			
			try {
			int ch=Integer.parseInt(br.readLine());
			if(ch==1) {
				//add student
				System.out.println("Enter Student Name: ");
				String name=br.readLine();
				System.out.println("Enter Student Phone: ");
				String phone=br.readLine();
				System.out.println("Enter Student City: ");
				String city=br.readLine();
				
				//create student object to store
				Student student = new Student(name,phone,city);
				System.out.println(student);
				
				boolean answer=studentDAO.insertStudentToDB(student);
				if(answer)
				{
					System.out.println("Student Added Successfully");
				}
				else {
					System.out.println("Something went wrong");
				}
			}
			else if(ch==2) {
				//update student
				System.out.println("Enter Student Id: ");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter Student Phone: ");
				String phone=br.readLine();
				System.out.println("Enter Student City: ");
				String city=br.readLine();
				
				//create student object to store
				Student student = new Student(id,phone,city);
				System.out.println(student);
				boolean answer=studentDAO.updateStudent(student);
				if(answer)
				{
					System.out.println("Student Updated Successfully");
				}
				else {
					System.out.println("Something went wrong");
				}
				
			}
			else if(ch==3) {
				//delete student
				System.out.println("Enter Student ID to Delete: ");
				int userId=Integer.parseInt(br.readLine());
				boolean answer=studentDAO.deleteStudent(userId);
				if(answer)
				{
					System.out.println("Student Deleted Successfully");
				}
				else {
					System.out.println("Something went wrong");
				}
			}
			else if(ch==4) {
				//display all students
				studentDAO.showAllStudents();
			}
			else if(ch==5) {
				//exit
				break;
			}
			
			
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("Thank You For Using This App");
		System.out.println("See You Soon..Bye..");
	}
	

}
