package com.vinod;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager04 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Order o1=(Order)s1.load(Order.class, "ord108");
		
		Transaction tx=s1.beginTransaction();
			s1.delete(o1);
		tx.commit();
		
		System.out.println("done");
	}
}
