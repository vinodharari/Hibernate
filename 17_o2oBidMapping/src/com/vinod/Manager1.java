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
		
		Address add=new Address();
		add.setHouseNo("1008");
		add.setStreetName("Mahavir Nagar");
		add.setStudent(st);
		
		Transaction t=s1.beginTransaction();
		s1.persist(st);
		s1.persist(add);
		t.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
