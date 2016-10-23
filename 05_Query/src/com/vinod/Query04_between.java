package com.vinod;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query04_between {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query qry = s1.createQuery("from Person where salary between 40000 and 50000");
		List<Person> list = qry.list();
		for(Person p1:list)
		{
			System.out.println(p1);
		}
	}

}
