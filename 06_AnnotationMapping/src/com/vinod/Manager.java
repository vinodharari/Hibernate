package com.vinod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Manager {
	public static void main(String[] args){
		System.out.println("before session");
		Session s1=Util.getSession();
		Person p1=new Person();
		
		p1.setPersonId(105);
		p1.setFirstName("veeru");
		p1.setAge(30);
		
		s1.beginTransaction();
			s1.save(p1);
		s1.getTransaction().commit();
		
		s1.flush();
		s1.close();
	}
}
