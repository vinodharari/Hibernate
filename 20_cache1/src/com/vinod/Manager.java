package com.vinod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Manager {
	public static void main(String[] args){
		
		Person p1=new Person();
		p1.setId(007);
		p1.setfName("vinod");
		p1.setlName("jain");
		
		Configuration c1=new Configuration();
		c1.configure();
		
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		
		s1.beginTransaction();
			s1.save(p1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		
		System.out.println("done");
	}

}
