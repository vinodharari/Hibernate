package com.vinod;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Criteria1 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Criteria ctr=s1.createCriteria(Person.class);
		List<Person> list=ctr.list();
		for(Person p1 : list)
		{
			System.out.println(p1);
		}
	}
}
