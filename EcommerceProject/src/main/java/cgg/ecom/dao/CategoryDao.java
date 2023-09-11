package cgg.ecom.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import cgg.ecom.entities.Category;
import cgg.ecom.entities.Users;
import cgg.ecom.helpers.Conn;

public class CategoryDao {
	private static Session session=Conn.getS();

	public void addCategory(Category category) {
		Transaction tx = session.beginTransaction();
		session.save(category);
		tx.commit();
		
	}
	public List<Category> getAllCategory()
	{
		String query=" from Category";
		Query q = session.createQuery(query);
		List resultList = q.getResultList();
		
		return resultList;
		
	}
	

}
