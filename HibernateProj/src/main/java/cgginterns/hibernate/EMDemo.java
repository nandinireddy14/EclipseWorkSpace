package cgginterns.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EMDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//create student object
		Student s=new Student();
		s.setId(1);
		s.setName("abc");
		s.setCity("hyd");
		
		//create certificate object
		Certificate certi = new Certificate();
		certi.setCourse("Android");
		certi.setDuration("2 months");
		
		s.setCerti(certi);
		
		//create student object
				Student s1=new Student();
				s1.setId(2);
				s1.setName("def");
				s1.setCity("hyd");
				
				//create certificate object
				Certificate certi1 = new Certificate();
				certi1.setCourse("Hibernate");
				certi1.setDuration("1.5 months");
				
				s1.setCerti(certi1);
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(s);
		session.save(s1);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
