package com.vinod;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Student st=new Student();
		
		st.setId(101);
		st.setFirstName("Vinod");
		st.setLastName("Jain");
		
		Mail m1=new Mail();
		m1.setId(1);
		m1.setUsername("abc");
		m1.setPassword("xyz");
		m1.setStudent(st);
		Mail m2=new Mail();
		m2.setId(2);
		m2.setUsername("hello");
		m2.setPassword("test");
		m2.setStudent(st);
		
		Transaction t=s1.beginTransaction();
		s1.persist(st);
		s1.persist(m1);
		s1.persist(m2);
		t.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
