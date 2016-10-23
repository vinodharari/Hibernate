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
		Student st1=new Student();
		st1.setId(102);
		st1.setFirstName("Samyak");
		st1.setLastName("Gyan");
		
		Batch b1=new Batch();
		b1.setId(1);
		b1.setTitle("regular");
		Batch b2=new Batch();
		b2.setId(2);
		b2.setTitle("crash");
		
		b1.addStudent(st);
		b1.addStudent(st1);
		b2.addStudent(st);
		b2.addStudent(st1);
		
		Transaction t=s1.beginTransaction();
		s1.persist(st);
		
		t.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
