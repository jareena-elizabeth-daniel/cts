package hb.embedded_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class App 
{
    
    	public static void main(String[] args) {
    		AnnotationConfiguration configuration = new AnnotationConfiguration();
    		configuration.configure("hibernate.cfg.xml");
    		
    		SessionFactory factory = configuration.buildSessionFactory();
    		Session session = factory.openSession();
    		Transaction transaction = session.beginTransaction();
    		
    		Address address = new Address("alchemy", "whitefield");
    		Person p1 = new Person("jareena", address);
    		session.save(p1);
    		
    		transaction.commit();
    		session.close();
    		System.out.println("Done ...");
    	}
    
        
    }

