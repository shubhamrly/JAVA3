package np;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class App {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String [] args)
{
	Configuration cfg=new Configuration();
	cfg.configure("cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tn=session.beginTransaction();
	emp e = new emp ();
	e.setId(12);
	e.setName("Shubh");
	session.save(e);
	
	emp e1 = new emp ();
	e1.setId(13);
	e1.setName("Shubh1");
	session.save(e1);
	
	Query q = session.createQuery("from emp");
	List <emp> l = q.getResultList();
	Iterator <emp> it = l.iterator();
	while(it.hasNext())
	{
		emp f = (emp)it.next();
		System.out.println(f.getId()+" "+f.getName());
	}
	
	tn.commit();
	session.close();
}
}
