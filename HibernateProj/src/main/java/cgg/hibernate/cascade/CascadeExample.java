package cgg.hibernate.cascade;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import cgginterns.hibernate.map1.Brand;
import cgginterns.hibernate.map1.Product;

public class CascadeExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
//		Brand b1 = new Brand();
//		b1.setBrandId(1);
//		b1.setBrandName("Apple");
//		
//		
//		
//		
//		Product p1 = new Product(21,"iphone");
//		Product p2 = new Product(22,"iPad");
//		Product p3 = new Product(23,"mac book");
//		
//		ArrayList<Product> list = new ArrayList<Product>();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		
//		p1.setBrand(b1);
//		p2.setBrand(b1);
//		p3.setBrand(b1);;
//		
//		
//		b1.setProducts(list);
//		
//		
//		Brand b2 = new Brand(2,"Samsung");
//		
//		Product p21 = new Product(41,"Samsung Phone");
//		Product p22 = new Product(42,"Samsung TV");
//		Product p23 = new Product(43,"Samsung AC");
//		
//		ArrayList<Product> list1 = new ArrayList<Product>();
//		list1.add(p21);
//		list1.add(p22);
//		list1.add(p23);
//		
//		p21.setBrand(b2);
//		p22.setBrand(b2);
//		p23.setBrand(b2);
//		
//		
//		
//		b2.setProducts(list1);
		
		Transaction tx = s.beginTransaction();
		
//		s.save(b1);
//		s.save(b2);
		
		Brand brand = s.get(Brand.class, 1);
		s.delete(brand);
		
//		String query="delete from Brand b LEFT JOIN FETCH b.products where b.brandId=:x";
//		Query q1 = s.createQuery(query);
//		q1.setParameter("x", 2);
//		q1.executeUpdate();
//		System.out.println("deleted");
		
		tx.commit();
		
		s.close();
		factory.close();

	}

}
