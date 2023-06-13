package cgg.hibernate.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import cgginterns.hibernate.map1.*;

public class HQLDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		//HQL
		//Syntax
		
//		String query="from Student";
//		String query="from Student where city=:x and name=:n";
//		String query="from Student as s where s.city=:x and s.name=:n";
//		String query="from Student s where s.city=:x and s.name=:n";
//		Query q = session.createQuery(query);
//		q.setParameter("x", "hyd");
//		q.setParameter("n", "abc");
//		//single result - (unique)
//		//multiple result -list
//		List<Student> list=q.list();
//		for(Student stu:list)
//		{
//			System.out.println(stu.getName()+":"+stu.getCity()+":"+stu.getCerti().getCourse()
//					);
//		}
//		System.out.println("----------------------------------------------------");
		
//		Transaction tx = session.beginTransaction();
		
		//delete query
		
//		Query q1 = session.createQuery("delete from Student s where s.city=:x");
//		q1.setParameter("x", "Hyd");
//		int r = q1.executeUpdate();
//		System.out.println("deleted : ");
//		System.out.println(r);

		//update query
//		Query q2 = session.createQuery("update Student set city=:x where name=:n");
//		q2.setParameter("x", "Hyd");
//		q2.setParameter("n", "def");
//		
//		int r=q2.executeUpdate();
//		System.out.println("updated : ");
//		System.out.println(r);
//		
//		tx.commit();
		
		
		//how to execute a join query
		Query q3 = session.createQuery("select b.brandId,b.brandName,p.productName from Brand as b INNER JOIN b.products as p");
		List<Object []> list=q3.getResultList();
		
		for(Object[] arr : list)
		{
			System.out.println(Arrays.toString(arr));
		}

		
		
		session.close();
		factory.close();
	}

}
