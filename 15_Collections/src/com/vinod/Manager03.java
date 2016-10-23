package com.vinod;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Query q1=s1.createQuery("from Student");
		List<Student> list=q1.list();
		for(Student s:list){
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEducations());
			System.out.println(s.getJobs());
			System.out.println(s.getMarks());
			System.out.println(s.getMobileNos());
			System.out.println(Arrays.toString(s.getProjects()));
			System.out.println(s.getSkills());
		}
	}
}
