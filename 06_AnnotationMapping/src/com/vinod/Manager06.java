package com.vinod;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager06 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		
		Query qry=s1.getNamedQuery("q5");
		List<Person> list=qry.list();
		
		for(Person row:list){
			System.out.println(row.getAge());
			System.out.println(row.getFirstName());
		}
	}
}
