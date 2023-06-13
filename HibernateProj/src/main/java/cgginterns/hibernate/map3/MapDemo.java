package cgginterns.hibernate.map3;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setEmpName("abc");
		
		Employee e2 = new Employee();
		e2.setEmpid(2);
		e2.setEmpName("def");
		
		Projects p1 = new Projects();
		p1.setPid(1);
		p1.setpName("ChatBot");
		
		Projects p2 = new Projects();
		p2.setPid(2);
		p2.setpName("Library Management");
		
		Projects p3 = new Projects();
		p3.setPid(3);
		p3.setpName("Migration");
		
		ArrayList<Employee> el1 = new ArrayList<Employee>();
		el1.add(e1);
		el1.add(e2);
		p1.setEmployee(el1);
		
		ArrayList<Employee> el2 = new ArrayList<Employee>();
		el2.add(e1);
		p2.setEmployee(el2);
		
		ArrayList<Employee> el3 = new ArrayList<Employee>();
		el3.add(e2);
		p3.setEmployee(el3);
		
		ArrayList<Projects> pl1 = new ArrayList<Projects>();
		pl1.add(p1);
		pl1.add(p2);
		e1.setProjects(pl1);
		
		ArrayList<Projects> pl2 = new ArrayList<Projects>();
		pl2.add(p3);
		pl2.add(p1);
		e2.setProjects(pl2);
		
		Session s = factory.openSession();
			Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		tx.commit();
		
		Employee emp =(Employee)s.get(Employee.class, 2);
		System.out.println(emp.getEmpName());
		for(Projects p:emp.getProjects())
		{
			System.out.println(p.getpName());
		}
		
		
		System.out.println("-----------------------------------------------");
		Projects proj =(Projects)s.get(Projects.class, 3);
		System.out.println(proj.getpName());
		for(Employee e:proj.getEmployee())
		{
			System.out.println(e.getEmpName());
		}
		
		s.close();
		factory.close();
	}

}
