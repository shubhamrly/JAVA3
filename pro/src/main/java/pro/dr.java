package pro;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class dr {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("e.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tn=session.beginTransaction();
	app a = new app();
	a.setId(1);
	a.setName("shubham");
	a.setSal(100);
	session.save(a);
	a = new app();
	a.setId(2);
	a.setName("sn");
	a.setSal(123);
	session.save(a);
	Query query = session.createQuery(" from app a  ");
	List<app> results = query.getResultList();
	Iterator <app> it = results.iterator();
	while(it.hasNext())
	{   app e = it.next();
		System.out.println(e.getId() +e.getName()+e.getSal());
	}
	tn.commit();
}}
