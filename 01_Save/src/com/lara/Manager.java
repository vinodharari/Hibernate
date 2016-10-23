 package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Manager {
	public static void main(String[] args){
		
		Person p1=new Person();
		p1.setId(8);
		p1.setName("vinod");
		
		Configuration c1=new Configuration();
		c1.configure();
		
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		
		s1.beginTransaction();
			//s1.save(p1);
			s1.save(p1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		
		System.out.println("done");
	}

}