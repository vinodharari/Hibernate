package com.vinod;

import org.hibernate.Session;

public class MAnager09 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Order o1=(Order)s1.get(Order.class, "ord107");
		
		System.out.println("order : "+o1);
		System.out.println(o1.getCustomerName());
		System.out.println(o1.getOrderId());
		System.out.println(o1.getPrice());
		System.out.println(o1.getQuantity());
	}
}
