package com.vinod;

import org.hibernate.Session;

public class Manager2 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		PersonPK pk=new PersonPK();
		pk.setFirstName("ramu");
		pk.setEmail("ramu@gmail.com");
		Person p1=(Person)s1.load(Person.class, pk);
		System.out.println("----------");
		System.out.println(p1.getAge());
		System.out.println(p1.getAddress());
		System.out.println(p1.getLastName());
		System.out.println(p1.getPersonPk().getFirstName());
		System.out.println(p1.getPersonPk().getEmail());
	}
}
