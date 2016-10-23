package com.vinod;

import org.hibernate.Session;

public class Manager2 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Person p1=(Person)s1.load(Person.class, "p105");
		System.out.println(p1.getAge());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getPersonId());
		Address a1=p1.getAddress();
		System.out.println(a1.getCity());
		System.out.println(a1.getHouseNo());
		System.out.println(a1.getState());
		System.out.println(a1.getStreetName());
	}
}
