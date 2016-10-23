package com.vinod;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager01 {
	public static void main(String[] args){
		Order o1=new Order();
		o1.setOrderId("ord108");
		o1.setCustomerName("Vinod6");
		o1.setQuantity(11);
		o1.setPrice(20000);
		
		Order o2=new Order();
		o2.setOrderId("ord109");
		o2.setCustomerName("Jain8");
		o2.setQuantity(12);
		o2.setPrice(30000);
		
		Session s1=Util.getSession();
		Transaction tx=s1.beginTransaction();
			s1.save(o1);
			s1.save(o2);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
