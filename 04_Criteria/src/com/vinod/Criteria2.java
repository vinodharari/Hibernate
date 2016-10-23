package com.vinod;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Criteria2 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		List<Person> list=s1.createCriteria(Person.class).list();
		for(Person p1 : list)
		{
			System.out.println(p1);
		}
	}
}
