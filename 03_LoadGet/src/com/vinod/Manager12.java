package com.vinod;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

public class Manager12 {
	public static void main(String[] args){
		Session s1=Util.getSession();
		Query qry=s1.createQuery("from Order");
		List<Order> orders=qry.list();
		for(Order order:orders){
			System.out.println(order.getOrderId());
			System.out.println(order.getCustomerName());
			System.out.println(order.getPrice());
			System.out.println(order.getQuantity());
			System.out.println("------");
		}
		
	}
}
