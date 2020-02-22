package hb.one_to_one;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App 
{public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = null;
	try {
		transaction = session.beginTransaction();
		Address address1 = new Address("Alchemy", "Whitefield", "BLR", "600097");
		Address address2 = new Address("Manyatha", "Hebbal", "Karnataka", "560000");
		Student student1 = new Student("Jareena", address1);
		Student student2 = new Student("Elizabeth", address2);
		session.save(student1);
		session.save(student2);
		transaction.commit();
	} catch (HibernateException e) {
		transaction.rollback();
		e.printStackTrace();
	} finally {
		session.close();
	}

}

}