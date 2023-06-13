package cgg.hibernate.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cgginterns.hibernate.map1.Brand;

public class FirstLevelCacheDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Brand brand1=null;
		System.out.println(s.contains(brand1));
		
		brand1 = s.get(Brand.class,2);
		System.out.println(s.contains(brand1));
		
		System.out.println(brand1);
		System.out.println("Working..");
		
		Brand brand2 = s.get(Brand.class,2);
		
		System.out.println(brand2);
		
		
		s.close();
		factory.close();
	}

}
