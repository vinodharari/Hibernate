package com.vinod;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager06 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Student s=(Student) s1.load(Student.class, 1);
		
		s1.beginTransaction();
		s1.delete(s);
		s1.getTransaction().commit();
		System.out.println("done");
	}
}
