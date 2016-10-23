package com.vinod;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Criterion_MinMax {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Criteria ctr=s1.createCriteria(Person.class);
		ctr.setFirstResult(3);
		ctr.setMaxResults(3);
		List<Person> list=ctr.list();
		for(Person p1 : list)
		{
			System.out.println(p1);
		}
	}
}
