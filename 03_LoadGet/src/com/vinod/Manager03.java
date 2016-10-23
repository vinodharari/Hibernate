package com.vinod;



import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager03 {
	public static void main(String[] args) {
		
		Session s1=Util.getSession();
		Order ord=(Order)s1.load(Order.class, "ord108");
		
		ord.setPrice(100);
		ord.setQuantity(1000);
		Transaction tx=s1.beginTransaction();
			s1.save(ord);
		tx.commit();
		
		s1.flush();
		s1.close();
	}
}
