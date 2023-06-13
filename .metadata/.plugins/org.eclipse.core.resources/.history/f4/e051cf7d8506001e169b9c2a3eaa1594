package cgg.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import cgginterns.hibernate.map1.Brand;

public class CriteriaExample {

	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		
//		Criteria c = s.createCriteria(Student.class);
//		c.add(Restrictions.eq("certi.course", "React"));
//		c.add(Restrictions.gt("id", 10));
//		c.add(Restrictions.like("certi.course", "A%"));
//		
//		List<Student> list = c.list();
//		
//		for(Student st :list)
//		{
//			System.out.println(st);
//		}
//		

		
		Criteria c = s.createCriteria(Brand.class);
		
		List<Brand> list = c.list();
		for(Brand b :list)
			{
				System.out.println(b);
			}
		

		s.close();

	}

}
