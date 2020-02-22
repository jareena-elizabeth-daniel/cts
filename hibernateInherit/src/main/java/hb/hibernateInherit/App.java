package hb.hibernateInherit;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee("name1","last1",new Date(),"hr");
        session.save(employee);
        
        transaction.commit();
        session.close();
        System.out.println("doneeeeee");
    }
}
