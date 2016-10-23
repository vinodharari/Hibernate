package com.vinod;

import org.hibernate.Session;

public class Manager1 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		PersonPK pk1=new PersonPK();
		pk1.setFirstName("ramu1");
		pk1.setEmail("ramu1@gmail.com");
		Person p1=new Person();
		p1.setLastName("blr");
		p1.setAge(22);
		p1.setAddress("BTM");
		p1.setPersonPk(pk1);
		
		PersonPK pk2=new PersonPK();
		pk2.setFirstName("ramana1");
		pk2.setEmail("ramu1@gmail.com");
		Person p2=new Person();
		p2.setLastName("blr");
		p2.setAge(22);
		p2.setAddress("BTM");
		p2.setPersonPk(pk2);
		
		s1.beginTransaction();
		s1.save(p1);
		s1.save(p2);
		s1.getTransaction().commit();
		
		System.out.println("done");
		
	}

}
