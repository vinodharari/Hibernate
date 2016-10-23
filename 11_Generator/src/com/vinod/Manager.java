package com.vinod;

import org.hibernate.Session;

public class Manager {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setId(10);
		p1.setFirstName("Ramana");
		Person p2=new Person();
		p2.setFirstName("Kiran");
		Person p3=new Person();
		p3.setFirstName("Manu");
		p3.setId(300);
		
		Session s1=Util.getSession();
		s1.beginTransaction();
		Integer obj1=(Integer)s1.save(p1);
		System.out.println("p1 saved: " + obj1);
		Integer obj2=(Integer)s1.save(p2);
		System.out.println("p2 saved: " + obj2);
		Integer obj3=(Integer)s1.save(p3);
		System.out.println("p3 saved: " + obj3);
		
		s1.getTransaction().commit();
		System.out.println("commited");
		System.out.println("done");
	}
}
