package com.vinod;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Session s1=Util.getSession();
		Order ord=null;
		s1.beginTransaction();
		do{
			ord=new Order();
			System.out.println("enter id");
			ord.setOrderId(sc.next());
			System.out.println("enter name");
			ord.setCustomerName(sc.next());
			System.out.println("enter quantity");
			ord.setQuantity(Integer.parseInt(sc.next()));
			System.out.println("enter price");
			ord.setPrice(Integer.parseInt(sc.next()));
			System.out.println("one more ?");
		}while("y".equals(sc.next()));
		s1.getTransaction().commit();
		System.out.println("done");
	}
}
