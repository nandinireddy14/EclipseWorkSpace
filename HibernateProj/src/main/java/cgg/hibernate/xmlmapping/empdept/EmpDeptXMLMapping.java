package cgg.hibernate.xmlmapping.empdept;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDeptXMLMapping {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		Department d1 = new Department();
		d1.setDeptName("cse");
		
		Employee e1 = new Employee();

		e1.setEmpName("xyz");
		e1.setEmpSal(30000.0);
		e1.setDept(d1);
		
		Employee e2 = new Employee();

		e2.setEmpName("pqr");
		e2.setEmpSal(40000.0);
		e2.setDept(d1);
		
		Employee e3 = new Employee();

		e3.setEmpName("hjk");
		e3.setEmpSal(50000.0);
		e3.setDept(d1);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		d1.setEmployees(list);
		
		Transaction tx = s.beginTransaction();
		
		s.save(d1);
		tx.commit();
		
		s.close();
		factory.close();

	}

}
