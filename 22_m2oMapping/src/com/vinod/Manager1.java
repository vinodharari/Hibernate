package com.vinod;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Actor a=new Actor();
		a.setAid(1);
		a.setActorname("ameer");
		
		Movies m1=new Movies();
		m1.setMid(2);
		m1.setMoviename("a");
		
		Movies m2=new Movies();
		m2.setMid(3);
		m2.setMoviename("a");
		
			
		s1.beginTransaction();
			s1.save(m1);
			s1.save(m2);
			s1.save(a);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
