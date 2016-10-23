package com.vinod;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query_sql2 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query q1 = s1.createSQLQuery("select age, salary from Personn where firstName='vijay'");
		List<Object[]> list = q1.list();
		for(Object[] p1:list)
		{
			System.out.println(Arrays.toString(p1));
		}
	}
}
