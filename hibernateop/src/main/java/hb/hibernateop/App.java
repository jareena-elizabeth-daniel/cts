package hb.hibernateop;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
			
		
		//1(Insert).........................................................
		  /*Person p1 = new Person(); 
		  //p1.setPid(101);
		  p1.setPnane("Viju1");
		  p1.setAge(31);
		  session.save(p1);		
		  */ 
		
		//2(From clause).............................................................
		/*String hql = "from Person";
		Query query = session.createQuery(hql);
		List list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Person s = (Person)list.get(i);
			System.out.println(s.getPid()+","+s.getPnane());
		}*/
		
		//3(select)...............................................................
		
		/*
		String hql = "select p.pnane from Person p";
		Query query = session.createQuery(hql);
		List list = query.list();
		for (int i = 0; i < list.size(); i++) {
			String name = (String)list.get(i);
			System.out.println("Name :"+name);
		}
		*/
		
		//4(where)..........................................................
		
		/*
		String hql = "from Person p WHERE pid = 4";
		Query query = session.createQuery(hql);
		List list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Person s = (Person)list.get(i);
			System.out.println(s.getPid()+","+s.getPnane());
		}
		
		*/
		
		
		//5(named parameter)....................................................................
		
		

		String hql = "from Person p WHERE p.pid = :spId";
		Query query = session.createQuery(hql);
		query.setParameter("spId", 8);	
		List list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Person s = (Person)list.get(i);
			System.out.println(s.getPid()+","+s.getPnane());
		}
		transaction.commit();
		
		session.close();
		System.out.println("annot done ...");
    }
}