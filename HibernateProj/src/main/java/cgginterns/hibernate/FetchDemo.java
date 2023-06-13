package cgginterns.hibernate;

import java.io.FileOutputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
//		Student s=(Student)session.get(Student.class, 1);
//		
//		System.out.println(s);
//		Student s1=(Student)session.load(Student.class, 1);
//		
//		System.out.println(s1
//				);
//		Address addr=(Address)session.load(Address.class, 2);//exception
//		Address addr=(Address)session.get(Address.class, 2);//null
//		Address addr=(Address)session.load(Address.class, 1);
//		System.out.println(addr.getStreet()+":"+addr.getCity());
//		Address addr1=(Address)session.load(Address.class, 1);
//		System.out.println(addr1.getStreet()+":"+addr1.getCity());
//		System.out.println(addr);

		Address addr=(Address)session.load(Address.class, 1);
		byte[] image=addr.getImage();
		try
		{
			FileOutputStream fos = new FileOutputStream("src//main//java//fetchedimage.jpg");
			fos.write(image);
			fos.flush();
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		session.close();
		factory.close();
	}

}
