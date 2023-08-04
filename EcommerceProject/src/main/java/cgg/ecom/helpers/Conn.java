package cgg.ecom.helpers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Conn {
	private static SessionFactory factory;
	private static Session s;
	static {
		 factory = new Configuration().configure().buildSessionFactory();
		 s =factory.openSession();
		}
	public static Session getS() {
		return s;
	}
}
