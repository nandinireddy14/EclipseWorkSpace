package cgginterns.hibernate.map1;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BrandProductMapDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creating brand
		Brand b1 = new Brand();
		b1.setBrandId(1);
		b1.setBrandName("Tata");
		
		//creating products
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setProductName("Tata Car");
		p1.setBrand(b1);
		
		Product p2 = new Product();
		p2.setProductId(2);
		p2.setProductName("Tata Salt");
		p2.setBrand(b1);
		
		Product p3 = new Product();
		p3.setProductId(3);
		p3.setProductName("Tata WestSide");
		p3.setBrand(b1);
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		b1.setProducts(list);
		
		
		Session s = factory.openSession();
		
		Transaction tx = s.beginTransaction();
		
//		s.save(b1);
//		s.save(p1);
//		s.save(p2);
//		s.save(p3);
		
		tx.commit();
		
		//fetching objects
		Brand brand = s.get(Brand.class, 1);
		System.out.println(brand.getBrandName());
		for(Product prd:brand.getProducts())
		{
			System.out.println(prd.getProductName());
		}
		
		
		s.close();
		factory.close();
	}
}
