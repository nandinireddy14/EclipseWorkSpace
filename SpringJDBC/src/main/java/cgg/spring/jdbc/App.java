package cgg.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cgg.spring.jdbc.dao.StudentDao;
import cgg.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	//spring jdbc=>jdbcTemplate
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentDao studentDao = context.getBean("studentdao",StudentDao.class);
    	
    	//INSERT
    	Student student=new Student();
    	student.setId(151);
    	student.setName("aff");
    	student.setCity("delhi");
    	
    	int r=studentDao.insert(student);
    	System.out.println("Student added..");
    	
    	//UPDATE
//    	Student student = new Student();
//    	student.setId(123);
//    	student.setName("Nandini");
//    	student.setCity("LB Nagar");
//    	
//    	int r = studentDao.change(student);
//    	System.out.println("data changed");
    	
    	
    	//DELETE
//    	int r=studentDao.delete(666);  
//    	System.out.println("Deleted "+r);
    	
//    	Student student = studentDao.getStudentId(123);
//    	System.out.println(student);
    	
    	List<Student> allStudents = studentDao.getAllStudents();
    	for(Student s:allStudents) {
    	System.out.println(s);
    	}
    	
    	
    }
}
//common pool version2.2.11
//common dbcp2 2.9
