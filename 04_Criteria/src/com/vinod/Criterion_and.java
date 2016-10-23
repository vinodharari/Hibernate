package com.vinod;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Criterion_and {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Criteria ctr=s1.createCriteria(Person.class);
		Criterion c1=Restrictions.lt("salary",40000);
		Criterion c2=Restrictions.ge("age",30);
		Criterion c3=Restrictions.or(c1,c2);
		Criterion c4=Restrictions.eq("address","btm");
		Criterion c5=Restrictions.eq("education","mca");
		Criterion c6=Restrictions.or(c4,c5);
		Criterion c7=Restrictions.and(c3,c6);
		ctr.add(c3);
		List<Person> list=ctr.list();
		for(Person p1 : list)
		{
			System.out.println(p1);
		}
	}
}
