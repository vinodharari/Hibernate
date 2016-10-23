package com.vinod;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Order obj=(Order)s1.load(Order.class, "ord108");
		
		System.out.println(obj.getOrderId());
		System.out.println(obj.getCustomerName());
		System.out.println(obj.getQuantity());
		System.out.println(obj.getPrice());
	}
}
