package cgg.hibernate.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		String query="select * from student";
		
		
		
		NativeQuery nq = s.createNativeQuery(query);
		
		nq.setFirstResult(0);
		nq.setMaxResults(5);
		
		List<Object[]> list = nq.list();
		

		
		for(Object[] obj:list)
		{
			System.out.println(Arrays.toString(obj));
//			System.out.println(obj[0]+" : "+obj[1]);
		}
		
		s.close();
		factory.close();

	}

}
