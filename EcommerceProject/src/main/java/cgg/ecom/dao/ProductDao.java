package cgg.ecom.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import cgg.ecom.entities.Product;
import cgg.ecom.entities.Users;
import cgg.ecom.helpers.Conn;

public class ProductDao {
	private static Session session=Conn.getS();

	public void addProduct(Product p) {
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		
	}
	public List<Product> getAllProducts() {
		Query q = session.createQuery("from Product");
		List resultList = q.getResultList();
		
		
		return resultList;
	}
	public List<Product> getProductByCategory(String cat){
		Query q=session.createQuery("from Product where product_category=:c");
		q.setParameter("c", cat);
		System.out.print(cat);
		List resultList = q.getResultList();
		
		return resultList;
		
	}
}
