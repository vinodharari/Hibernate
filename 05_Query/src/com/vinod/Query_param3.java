package com.vinod;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query_param3 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query q1 = s1.createQuery("from Person where education like :educ and salary > :sal");
		q1.setString("educ", "%M%");
		q1.setInteger("sal", 30000);
		List<Person> list = q1.list();
		for(Person p1:list)
		{
			System.out.println(p1);
		}
	}
}
