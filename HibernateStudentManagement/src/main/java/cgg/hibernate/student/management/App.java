package cgg.hibernate.student.management;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
//    	Student s1 = new Student();
//    	s1.setStudentId(1);
//    	s1.setStudentName("nandini");
//    	s1.setStudentPhone("122345");
//    	s1.setStudentCity("LB Nagar");
//    	
//    	Student s2 = new Student();
//    	s2.setStudentId(2);
//    	s2.setStudentName("divya");
//    	s2.setStudentPhone("978675");
//    	s2.setStudentCity("JBS");
//    	
//    	Student s3 = new Student();
//    	s3.setStudentId(3);
//    	s3.setStudentName("Navya");
//    	s3.setStudentPhone("34567");
//    	s3.setStudentCity("Bnreddy");
//    	
//    	Student s4 = new Student();
//    	s4.setStudentId(4);
//    	s4.setStudentName("Rinku");
//    	s4.setStudentPhone("154567");
//    	s4.setStudentCity("Kothapet");
//    	
//    	Student s5 = new Student();
//    	s5.setStudentId(5);
//    	s5.setStudentName("Abhi");
//    	s5.setStudentPhone("5678543");
//    	s5.setStudentCity("Hastinapur");
		Scanner sc = new Scanner(System.in);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		while (true) {
			System.out.println("1.Add 2.Update 3.Delete 4.DisplayAll 5.Exit");
			System.out.println("Enter Your Choice : ");
			int op = sc.nextInt();
			if (op == 1) {
				System.out.println("Enter ID:");
				int id = sc.nextInt();
				System.out.println("Enter Name:");
				String name = sc.next();
				System.out.println("Enter Phone:");
				String phone = sc.next();
				System.out.println("Enter City:");
				String city = sc.next();
				Student s1 = new Student(id, name, phone, city);
				Session s = factory.openSession();
				Transaction tx = s.beginTransaction();

				s.save(s1);
				tx.commit();
				s.close();
				System.out.println("Insertion Successfull");
			} else if (op == 2) {
				System.out.println("Enter Id to update :");
				int id = sc.nextInt();
				Session s = factory.openSession();
				Transaction tx = s.beginTransaction();

				Student stud = s.get(Student.class, id);
				System.out.println("Enter new phoneNumber to update :");
				String ph = sc.next();
				System.out.println("Enter new city to update :");
				String city = sc.next();
				stud.setStudentPhone(ph);
				stud.setStudentCity(city);

//    	        s.update(stud);
				tx.commit();
				s.close();
				System.out.println("Update Succesfull");
			} else if (op == 3) {
				System.out.println("Enter Id to delete :");
				int id = sc.nextInt();
				Session s = factory.openSession();
				Transaction tx = s.beginTransaction();
				Student s1 = s.get(Student.class, id);

				s.delete(s1);
				tx.commit();
				s.close();
				System.out.println("Deletion Successfull");

			} else if (op == 4) {

				Session s = factory.openSession();
				String query = "from Student";
				Query q = s.createQuery(query);
				List<Student> list = q.list();
				System.out.println("---------------------------------------------------------------");
				System.out.println("id" + "\t" + "Name" + "\t" + "Phone" + "\t" + "City");
				for (Student stu : list) {
					System.out.println(stu.getStudentId() + "\t" + stu.getStudentName() + "\t" + stu.getStudentPhone()
							+ "\t" + stu.getStudentCity());
				}
				System.out.println("---------------------------------------------------------------");
				s.close();
			} else if (op == 5) {
				break;
			}

		}

//        s.save(s2);
//        s.save(s3);
//        s.save(s4);
//        s.save(s5);

		factory.close();
	}
}
