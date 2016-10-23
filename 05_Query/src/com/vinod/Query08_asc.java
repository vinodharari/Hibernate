package com.vinod;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query08_asc {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query q1 = s1.createQuery("from Person order by age");
		Query q2 = s1.createQuery("from Person order by age asc");
		List<Person> list = q2.list();
		for(Person p1:list)
		{
			System.out.println(p1);
		}
	}

}
