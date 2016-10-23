package com.vinod;

import org.hibernate.Session;

public class Manager1 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Person p1=new Person();
		p1.setId(101);
		p1.setFirstName("vinod");
		p1.setLastName("jain");
		
		Employee e1=new Employee();
		e1.setId(201);
		e1.setFirstName("ramu");
		e1.setLastName("kaka");
		e1.setEmail("ramu@xyz.com");
		e1.setAddress("BTM");
		
		PermanentEmployee pe1=new PermanentEmployee();
		pe1.setId(301);
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
