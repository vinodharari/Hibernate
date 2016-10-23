package com.vinod;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query_named2 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query q1 = s1.getNamedQuery("q2");
		q1.setString(0, "%m%");
		q1.setInteger(1, 35);
		List<Object[]> list = q1.list();
		for(Object[] p1:list)
		{
			System.out.println(Arrays.toString(p1));
		}
	}
}
