package com.vinod;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query_param2 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query q1 = s1.createQuery("from Person where address like ? and salary > ?");
		q1.setString(0, "%halli%");
		q1.setInteger(1, 30000);
		List<Person> list = q1.list();
		for(Person p1:list)
		{
			System.out.println(p1);
		}
	}
}
