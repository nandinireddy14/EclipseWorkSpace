package cgg.spring.orm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cgg.spring.orm.config.HibernateConfig;
import cgg.spring.orm.dao.StudentDao;
import cgg.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);

//        Student student = new Student();
//        student.setStudentId(123);
//        student.setStudentName("abc");
//        student.setStudentCity("hyd");
//        
//        int i = studentDao.insert(student);
//        System.out.println("done "+i);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 2 for dipslay all students");
			System.out.println("PRESS 3 get detail of single student");
			System.out.println("PRESS 4 for delete student");
			System.out.println("PRESS 5 for update student");
			System.out.println("PRESS 6 for Exit");
			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:// add a new student
					System.out.println("Enter student id : ");
					int uId = Integer.parseInt(br.readLine());
					System.out.println("Enter student name : ");
					String name = br.readLine();
					System.out.println("Enter student city : ");
					String city = br.readLine();

					Student student1 = new Student();
					student1.setStudentId(uId);
					student1.setStudentName(name);
					student1.setStudentCity(city);

					int r = studentDao.insert(student1);
					System.out.println("done " + r + " students added");

					System.out.println("************************************");
					System.out.println();
					break;

				case 2:
					// display all students
					List<Student> allStudents = studentDao.getAllStudents();
					for (Student st : allStudents) {
						System.out.println("Id : " + st.getStudentId());
						System.out.println("Name : " + st.getStudentName());
						System.out.println("City : " + st.getStudentCity());
						System.out.println("_______________________________________");
					}
					System.out.println("********************************************");
					break;

				case 3:
					// get single student data
					System.out.println("Enter student id : ");
					int stuId = Integer.parseInt(br.readLine());

					Student stud = studentDao.getStudent(stuId);
					System.out.println("Id : " + stud.getStudentId());
					System.out.println("Name : " + stud.getStudentName());
					System.out.println("City : " + stud.getStudentCity());
					System.out.println("_________________________________________");
					break;
				case 4:
					// delete student
					System.out.println("Enter student id : ");
					int stuId1 = Integer.parseInt(br.readLine());

					studentDao.delete(stuId1);
					System.out.println("student deleted");
					System.out.println("____________________________________________________");
					break;
				case 5:
					// update student
					System.out.println("Enter student id : ");
					int uId1 = Integer.parseInt(br.readLine());
					System.out.println("Enter student name : ");
					String name1 = br.readLine();
					System.out.println("Enter student city : ");
					String city1 = br.readLine();

					Student student11 = new Student();
					student11.setStudentId(uId1);
					student11.setStudentName(name1);
					student11.setStudentCity(city1);

					studentDao.update(student11);
					System.out.println("student updated");
					break;

				case 6:
					// exit
					go = false;
					break;
				}
			}

			catch (NumberFormatException | IOException e) {
				System.out.println("Invalid input try with another one !!");
				System.out.println(e.getMessage());
			}

		}
		System.out.println();
	}
}
