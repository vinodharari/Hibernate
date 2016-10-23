package com.vinod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Manager02 {
	public static void main(String[] args){
		
		Configuration c1=new Configuration();
		c1.configure();
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		Session s2=sf.openSession();
		
		Person p1=(Person)s1.load(Person.class, 007);
		System.out.println(p1.getfName());
		System.out.println(p1.getlName());
		System.out.println("-----------");
		
		Person p2=(Person)s1.load(Person.class, 007);
		System.out.println(p2.getfName());
		System.out.println(p2.getlName());
		System.out.println("-----------");
		System.out.println("===========");
		
		Person p3=(Person)s2.load(Person.class, 007);
		System.out.println(p3.getfName());
		System.out.println(p3.getlName());
		System.out.println("-----------");
		
		Person p4=(Person)s2.load(Person.class, 007);
		System.out.println(p4.getfName());
		System.out.println(p4.getlName());
	}
}
