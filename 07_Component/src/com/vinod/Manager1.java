package com.vinod;

import org.hibernate.Session;

public class Manager1 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Address add1=new Address();
		
		add1.setHouseNo("123/M");
		add1.setStreetName("BTM");
		add1.setCity("Blr");
		add1.setState("kar");
		
		Person p1=new Person();
		p1.setPersonId("p105");
		p1.setFirstName("abc");
		p1.setLastName("xyz");
		p1.setAge(22);
		p1.setAddress(add1);
		
		Address add2=new Address();
		add2.setHouseNo("127/M");
		add2.setStreetName("MaratHalli");
		add2.setCity("Blr");
		add2.setState("kar");
		
		Person p2=new Person();
		p2.setPersonId("p129");
		p2.setFirstName("vinod");
		p2.setLastName("jain");
		p2.setAge(22);
		p2.setAddress(add1);
		
		s1.beginTransaction();
		s1.save(p1);
		s1.save(p2);
		s1.getTransaction().commit();
		
		System.out.println("done");
	}
}
