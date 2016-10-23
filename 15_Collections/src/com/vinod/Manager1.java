package com.vinod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1 {
	public static void main(String[] args) {
		Session s1=Util.getSession();
		Student st=new Student();
		
		st.setName("abc");
		st.setMobileNos(new int[]{89513872, 93419041});
		String[] projects={"citi", "hdfc", "kotak"};
		st.setProjects(projects);
		
		Collection list=new ArrayList();
		list.add("C");
		list.add("C++");
		list.add("Java");
		st.setSkills(list);
		
		List marks=new ArrayList();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		st.setMarks(marks);
		
		Set jobs=new HashSet();
		jobs.add("software");
		jobs.add("hardware");
		jobs.add("teacher");
		st.setJobs(jobs);
		
		Map educations=new HashMap();
		educations.put("degree", "Bsc");
		educations.put("post-degree", "Msc");
		st.setEducations(educations);
		
		Transaction t=s1.beginTransaction();
		s1.save(st);
		t.commit();
		s1.flush();
		s1.close();
		
		System.out.println("done");	
	}
}
