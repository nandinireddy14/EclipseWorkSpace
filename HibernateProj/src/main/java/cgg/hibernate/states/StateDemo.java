package cgg.hibernate.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cgginterns.hibernate.Student;

public class StateDemo {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
//	//creating student object
//	Student student=new Student();
//	student.setId(1414);
//	student.setName("klm");
//	student.setCity("abids");
//	student.setCerti(new Certificate("Android","2 months"));
//	
	//student :transient state 
	
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();
//	s.save(student);
	//student :persistant state :session,database in sync changes reflects
//	student.setName("rty");
	

	
	Student st=s.get(Student.class, 1414);
	
	
	//student :removed state calling delete
//	s.delete(student);
//	System.out.println(st.getName());
	
	
	
	
	
	//detached state
//	//s.evict(st);
//	//st.setName("hjk");
//	//s.update(st);
	
	
//	s.delete(st);
//	s.update(st);
	
	tx.commit();
	s.close();
	
	st.setName("wer");
	Session se = factory.openSession();
	
	Transaction tx1 = s.beginTransaction();
	
	se.update(st);
	tx1.commit();
	se.close();
	//student:detached state : no changes in the database
//	student.setName("klm");
//	System.out.println(student.getName());
	
	
//	
//	Session session = factory.openSession();
//	Transaction tx1 = session.beginTransaction();
//	
//	session.update(student);
//	//persistant state
//	tx1.commit();
//	Student student2=session.get(Student.class, 1414);
//	System.out.println(student2.getCity()+" "+student2.getName() );
//	session.close();
	factory.close();
	
}
}
