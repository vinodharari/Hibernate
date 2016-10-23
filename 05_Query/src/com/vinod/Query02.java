package com.vinod;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		List<Person> list = s1.createQuery("from Person").list();
		for(Person p1:list)
		{
			System.out.println(p1);
		}
	}

}
