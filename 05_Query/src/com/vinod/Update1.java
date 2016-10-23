package com.vinod;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Update1 {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setId(13);
		p1.setFirstName("vinod");
		p1.setEducation("BE");
		p1.setAddress("BTM");
		p1.setSalary(40000);
		p1.setAge(25);
		
		Session s1=Util.getSession();
		s1.beginTransaction();
			Integer obj=(Integer)s1.save(p1);
		s1.getTransaction().commit();
		System.out.println(obj);
		System.out.println("done");
	}
}
