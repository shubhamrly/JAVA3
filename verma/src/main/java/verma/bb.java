package verma;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class bb {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String [] args)
{
	Configuration cfg=new Configuration();
	cfg.configure("cc.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tn=session.beginTransaction();
 
	aa  a = new aa();
	a.setId(1);
	a.setName("Shub");
	session.save(a);
	a = new aa();
	a.setId(2);
	a.setName("KK");
	session.save(a);
	
	Query q=session.createQuery("from aa");
	List <aa> ll = q.getResultList();
	Iterator<aa> it= ll.iterator();
	while(it.hasNext())
	{
		 a = it.next();
		System.out.println(a.getId()+a.getName());
	}
	tn.commit();
}
}
