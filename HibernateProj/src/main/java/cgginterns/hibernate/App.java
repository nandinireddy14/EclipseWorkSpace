package cgginterns.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started!" );
      //  SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Configuration cfg = new Configuration();
        cfg.configure();//cfg.configure("cgginterns.hibernate/hibernate.cfg.xml")cfg.configure("hiber.cfg.xml")if xml file (path&name)is in other location or file name is differnet
        SessionFactory factory = cfg.buildSessionFactory();
        
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
        //creating student object
        Student student = new Student();
        student.setId(1);
        student.setName("abc");
        student.setCity("abids");
        
        System.out.println(student);
        
        //creating address object
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("hyd");
        ad.setOpen(true);
        ad.setX(12.34);
        ad.setAddedDate(new Date());
        
        //Reading image file and storing in database
        try{
        	FileInputStream fis=new FileInputStream("src//main//java//rose.jpg");
        	byte[] data=new byte[fis.available()];
        	fis.read(data);
        	ad.setImage(data);
        	fis.close();
        }
        catch(FileNotFoundException e)
        {
        	e.printStackTrace();
        }
        catch(IOException ie)
        {
        	ie.printStackTrace();
        }
        
        
        Session session = factory.openSession();
        
       // session.beginTransaction(); //for dml tranasaction is needed
        Transaction tx = session.beginTransaction();
        session.save(student);    
        session.save(ad);
      //  session.getTransaction().commit();
        tx.commit();
        
        
        session.close();
        factory.close();
        System.out.println("Done");
    }
}
