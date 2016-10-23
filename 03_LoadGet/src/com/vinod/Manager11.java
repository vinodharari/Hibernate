package com.vinod;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager11 {
	public static void main(String[] args){
		Session s1=Util.getSession();
		Criteria ctr=s1.createCriteria(Order.class);
		List<Order> orders=ctr.list();
		for(Order order:orders){
			System.out.println(order.getOrderId());
			System.out.println(order.getCustomerName());
			System.out.println(order.getPrice());
			System.out.println(order.getQuantity());
			System.out.println("------");
		}
		
	}
}
