package com.vinod;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query_append {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		StringBuffer sb=new StringBuffer();
		sb.append("from Person where ");
		sb.append("(salary > 40000 or age < 30) and ");
		sb.append("(address = 'btm' or education='mca')");
		Query qry = s1.createQuery(sb.toString());
		List<Person> list = qry.list();
		for(Person p1:list)
		{
			System.out.println(p1);
		}
	}

}
