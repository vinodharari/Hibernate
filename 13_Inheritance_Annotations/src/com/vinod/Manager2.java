package com.vinod;

import org.hibernate.Session;

public class Manager2 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		System.out.println(s1);
		Person2 p1=new Person2();
		p1.setId(111);
		p1.setFirstName("vinod");
		p1.setLastName("jain");
		
		Employee2 e1=new Employee2();
		e1.setId(222);
		e1.setFirstName("ramu");
		e1.setLastName("kaka");
		e1.setEmail("ramu@xyz.com");
		e1.setAddress("BTM");
		
		PermanentEmployee2 pe1=new PermanentEmployee2();
		pe1.setId(333);
		pe1.setFirstName("katu");
		pe1.setLastName("bhai");
		pe1.setEmail("katu@pqr.com");
		pe1.setAddress("hosaroad");
		pe1.setSalary(35555);
		pe1.setDesignation("Engineer");
		
		s1.beginTransaction();
		s1.save(p1);
		s1.save(e1);
		s1.save(pe1);
		s1.getTransaction().commit();
		
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
