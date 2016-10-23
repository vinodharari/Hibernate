package com.vinod;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query_select3 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query qry = s1.createQuery("select firstName, age from Person");
		List<Object[]> list = qry.list();
		for(Object[] p1:list)
		{
			System.out.println(Arrays.toString(p1));
		}
	}
}
