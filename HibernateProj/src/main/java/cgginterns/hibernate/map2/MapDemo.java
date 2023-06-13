package cgginterns.hibernate.map2;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setStudentName("abc");

		
		Student s2 = new Student();
		s2.setStudentId(2);
		s2.setStudentName("def");
		
		Student s3 = new Student();
		s3.setStudentId(3);
		s3.setStudentName("ghi");
		
		Courses c1 = new Courses();
		c1.setCourseId(1);
		c1.setCourseName("Python");
		
		Courses c2 = new Courses();
		c2.setCourseId(2);
		c2.setCourseName("Java");
		
		Courses c3 = new Courses();
		c3.setCourseId(3);
		c3.setCourseName("C");
		
		Courses c4 = new Courses();
		c4.setCourseId(4);
		c4.setCourseName("C++");
		
		
		ArrayList<Student> sl1 = new ArrayList<Student>();
		sl1.add(s1);
		sl1.add(s3);
		c1.setStudent(sl1);
		
		ArrayList<Student> sl2 = new ArrayList<Student>();
		sl2.add(s1);
		sl2.add(s2);
		sl2.add(s3);
		c2.setStudent(sl2);
		
		ArrayList<Student> sl3 = new ArrayList<Student>();
		sl3.add(s1);
		sl3.add(s2);
		c3.setStudent(sl3);
		
		ArrayList<Student> sl4 = new ArrayList<Student>();
		sl4.add(s1);
		c4.setStudent(sl4);
		
		ArrayList<Courses> cl1 = new ArrayList<Courses>();
		cl1.add(c1);
		cl1.add(c2);
		cl1.add(c3);
		s1.setCourses(cl1);
		
		ArrayList<Courses> cl2 = new ArrayList<Courses>();
		cl2.add(c1);
		cl2.add(c4);
		s2.setCourses(cl2);
		
		ArrayList<Courses> cl3 = new ArrayList<Courses>();
		cl3.add(c2);
		cl3.add(c3);
		cl3.add(c4);
		s3.setCourses(cl3);
		
		
		Session s = factory.openSession();
			Transaction tx = s.beginTransaction();
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);
		tx.commit();
		
		Student student =(Student)s.get(Student.class, 3);
		System.out.println(student.getStudentName());
		for(Courses c:student.getCourses())
		{
			System.out.println(c.getCourseName());
		}
		
		Courses course =(Courses)s.get(Courses.class, 3);
		System.out.println(course.getCourseName());
		for(Student st:course.getStudent())
		{
			System.out.println(st.getStudentName());
		}
		
		s.close();
		factory.close();
	}

}
