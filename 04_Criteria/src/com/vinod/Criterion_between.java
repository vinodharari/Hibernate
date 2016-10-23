package com.vinod;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Criterion_between {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Criteria ctr=s1.createCriteria(Person.class);
		Criterion c1=Restrictions.between("salary",40000,50000);
		ctr.add(c1);
		List<Person> list=ctr.list();
		for(Person p1 : list)
		{
			System.out.println(p1);
		}
	}
}
