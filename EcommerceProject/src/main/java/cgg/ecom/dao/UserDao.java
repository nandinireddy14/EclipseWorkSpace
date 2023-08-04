package cgg.ecom.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import cgg.ecom.entities.Users;
import cgg.ecom.helpers.Conn;

public class UserDao {
	private static Session session=Conn.getS();
	public void addUser(Users u) {
		Transaction tx = session.beginTransaction();
		session.save(u);
		tx.commit();
	}
	public Users getUser(String email, String password) {
		Query q = session.createQuery("from Users u where u.userEmail=:e and u.userPassword=:p");
		q.setParameter("e", email);
		q.setParameter("p", password);
		System.out.println(q.uniqueResult());
		
		Users u1 = (Users) q.uniqueResult();
		
		return u1;
	}

}
