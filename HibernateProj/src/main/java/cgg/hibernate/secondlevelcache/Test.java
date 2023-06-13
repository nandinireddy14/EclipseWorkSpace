package cgg.hibernate.secondlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cgginterns.hibernate.map1.Brand;
import cgginterns.hibernate.Student;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		Brand brand1 = s1.get(Brand.class, 2);
		System.out.println(brand1);
		
		Brand brand3 = s1.get(Brand.class, 2);
		System.out.println(brand3);
		s1.close();
		
		Session s2 = factory.openSession();
		Brand brand2 = s2.get(Brand.class, 2);
		System.out.println(brand2);
		s2.close();
		
		
		System.out.println("------------------------------------------");
		Session s3 = factory.openSession();
		Student stud1 = s3.get(Student.class, 10);
		System.out.println(stud1);
		
		s3.close();
		
		Session s4 = factory.openSession();
		Student stud2 = s4.get(Student.class, 10);
		System.out.println(stud2);
		s4.close();
		
		
		factory.close();

	}

}
