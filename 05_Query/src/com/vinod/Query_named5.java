package com.vinod;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Query_named5 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query q1 = s1.getNamedQuery("q5");
		List<Integer> list = q1.list();
		for(Integer p1:list)
		{
			System.out.println(p1);
		}
	}
}
