package cgg.hibernate.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import cgginterns.hibernate.Student;

public class HQLPagination {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session s = factory.openSession();
	Query q1 = s.createQuery("from Student");
	
	//implementing pagination using hibernate
	
	q1.setFirstResult(6); //starting index
	q1.setMaxResults(5); //page size
	
	List<Student> list = q1.list();
	
	for(Student st : list)
	{
		System.out.println(st.getId()+" : "+st.getName()+" : "+st.getCity());
	}
	
	
	s.close();
	factory.close();
}
}
