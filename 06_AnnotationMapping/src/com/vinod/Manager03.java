package com.vinod;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		
		Query qry=s1.getNamedQuery("q2");
		System.out.println(qry);
		List<Object[]> list=qry.list();
		
		for(Object[] row:list){
			System.out.println(Arrays.toString(row));
		}
	}
}
