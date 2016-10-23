package com.vinod;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query_max {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query q1 = s1.createQuery("from Person order by address");
		q1.setMaxResults(4);
		List<Person> list = q1.list();
		for(Person p1:list)
		{
			System.out.println(p1);
		}
	}
}
