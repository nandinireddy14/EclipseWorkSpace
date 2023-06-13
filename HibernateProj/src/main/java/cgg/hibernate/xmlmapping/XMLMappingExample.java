package cgg.hibernate.xmlmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class XMLMappingExample {

	public static void main(String[] args) {
		
		Person p1 = new Person(101,"abc","hyd","123456");
		Person p2 = new Person(102,"def","ktp","876543");
		Person p3 = new Person(103,"ghi","mall","7654321");
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		Transaction tx = s.beginTransaction();
		
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		tx.commit();
		s.close();
		factory.close();
	}

}
