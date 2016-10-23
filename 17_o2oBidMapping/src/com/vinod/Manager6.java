package com.vinod;

import org.hibernate.Session;

public class Manager6 {
	public static void main(String[] args) {
		Session session=Util.getSession();
		Student s1=(Student)session.load(Student.class, 1);
		session.beginTransaction();
		session.delete(s1);
		session.getTransaction().commit();
		System.out.println("done");
	}
}
